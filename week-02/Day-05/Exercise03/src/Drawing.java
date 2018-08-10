import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int startPointX = 50;
        int startPointY = 250;
        int size = 10;

        for (int j = 21; j > 0; j--) {
            rowOfTriangle(graphics, j, startPointX, startPointY, size);
            startPointX += size/2;
            startPointY -= size;
        }
    }
    public static void drawTriangle(Graphics graphics,  int x, int y, int size) {
       graphics.drawLine(x, y, x + size, y);
       graphics.drawLine(x + size, y, x + size/2, y - size);
       graphics.drawLine(x + size/2, y - size, x, y);
    }
    
    public static void rowOfTriangle(Graphics graphics,int n,  int x, int y, int size) {
        for (int i = 0; i < n; i++) {
            drawTriangle(graphics, x, y, size);
            x += size;
        }
    }

    // Don't touch the code below
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