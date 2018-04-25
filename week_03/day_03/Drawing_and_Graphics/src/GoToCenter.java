import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {

        int xValue = 0;
        int yValue = 0;

        for (int i = 0; i < 3; i++) {

            int number = i + 1;

            Scanner scanner = new Scanner(System.in);

            System.out.printf("Add an integer for x%d: ", number);
            xValue += scanner.nextInt();

            System.out.printf("Add an integer for y%d: ", number);
            yValue += scanner.nextInt();

            parameterLoop(graphics, xValue, yValue);
        }
    }

    private static void parameterLoop(Graphics graphics, int xValue, int yValue) {
        graphics.setColor(Color.BLACK);
        graphics.drawLine(xValue, yValue, WIDTH / 2, HEIGHT / 2);
    }




    // Can't touch this ~

    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}