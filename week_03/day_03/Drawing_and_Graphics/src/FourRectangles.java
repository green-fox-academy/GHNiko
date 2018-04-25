import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void mainDraw(Graphics graphics){

        for (int i = 0; i < 4; i++) {

            int xStart = (int) (Math.random() * 321);
            int yStart = (int) (Math.random() * 344);
            int aSideWidth = (int) (Math.random() * 300);
            int bSideLength = (int) (Math.random() * 340);

            int colorR = (int)(Math.random() * 256);
            int colorG = (int)(Math.random() * 256);
            int colorB = (int)(Math.random() * 256);

            graphics.setColor(new Color(colorR,  colorG, colorB));
            graphics.drawRect(xStart, yStart, aSideWidth, bSideLength);
        }

    }

    //    Can't touch this ~
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
