import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class R3 {
    public static void mainDraw(Graphics graphics) {

        int xValue = 0;
        int yValue = 0;

        for (int i = 0; i < 19; i++) {

            xValue += 10;
            yValue += 10;

            graphics.setColor(new Color(177, 69, 243));
            graphics.fillRect(xValue, yValue, 10, 10);

            graphics.setColor(Color.BLACK);
            graphics.drawRect(xValue, yValue, 10, 10);
        }
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
