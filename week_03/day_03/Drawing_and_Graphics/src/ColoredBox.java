import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.BLACK);
        graphics.drawLine(80, 80, 200, 80);

        graphics.setColor(Color.DARK_GRAY);
        graphics.drawLine(200, 80, 200, 200);

        graphics.setColor(Color.GRAY);
        graphics.drawLine(200, 200, 80, 200);

        graphics.setColor(Color.DARK_GRAY);
        graphics.drawLine(80, 200, 80, 80);
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