import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class R4 {
    public static void mainDraw(Graphics graphics) {

        int xValue = 10;
        int yValue = 10;
        int aSideWidth = 0;
        int bSideHeight = 0;

        for (int i = 0; i < 6; i++) {

            xValue += i*10;
            yValue += i*10;
            aSideWidth += 10;
            bSideHeight += 10;

            graphics.setColor(new Color(177, 69, 243));
            graphics.fillRect(xValue, yValue, aSideWidth, bSideHeight);

            graphics.setColor(Color.BLACK);
            graphics.drawRect(xValue, yValue, aSideWidth, bSideHeight);
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
