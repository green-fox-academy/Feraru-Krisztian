import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {

        star(graphics);
    }

    public static void star(Graphics graphics) {
        int x = 0;
        int y = 0;
        int x1 = 0;
        int y1 = 0;
        graphics.setColor(Color.green);

        for (int i = 0; i < HEIGHT/2; i = i + 10) {
            graphics.drawLine(WIDTH/2,y + i, WIDTH/2 - i, HEIGHT/2);
        }
        for (int j = 0; j < HEIGHT/2; j = j + 10) {
            graphics.drawLine(WIDTH/2, y + j,WIDTH/2 + j, HEIGHT/2);
        }
        for (int k = 0; k < WIDTH/2 ; k = k + 10) {
            graphics.drawLine(WIDTH/2, HEIGHT/2 + k, WIDTH - k, HEIGHT/2);
        }
        for (int l = 0; l < HEIGHT/2 ; l = l + 10) {
            graphics.drawLine(WIDTH/2, HEIGHT/2 + l, x1 + l, HEIGHT/2);
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
