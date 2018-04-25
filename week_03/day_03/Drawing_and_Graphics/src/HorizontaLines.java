import javax.swing.*;

import java.awt.*;
import java.time.Year;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontaLines {
    public static void mainDraw(Graphics graphics) {

        int xValue = 0;
        int yValue = 0;

        for (int i = 0; i < 3; i++) {

            int number = i + 1;

            Scanner scanner = new Scanner(System.in);

            System.out.printf("Please, enter a value for x%d: ", number);
            xValue += scanner.nextInt();

            System.out.printf("Please, enter a value for y%d: ", number);
            yValue += scanner.nextInt();

            horizontalLine(graphics, xValue, yValue);
        }
    }

    private static void horizontalLine(Graphics graphics, int xValue, int yValue) {
        int endX = xValue + 50;
        graphics.setColor(Color.BLACK);
        graphics.drawLine(xValue, yValue, endX, yValue);
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
