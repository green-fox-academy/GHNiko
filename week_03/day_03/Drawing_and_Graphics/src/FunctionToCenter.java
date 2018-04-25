import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {

        int end = WIDTH / 2;
        graphics.setColor(new Color(52, 150, 200));
        int x;
        int y;

        for (int i = 0; i < 16; i++) {
            x = i * 20;
            y = i * 20;
            toTheCenter(x, y, end, graphics);
        }
    }
    public static void toTheCenter(int x, int y, int end, Graphics graphics) {
        graphics.drawLine(x, 0, end, end);
        graphics.drawLine(0, y, end, end);
        graphics.drawLine(x, WIDTH, end, end);
        graphics.drawLine(WIDTH, y, end, end);
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
