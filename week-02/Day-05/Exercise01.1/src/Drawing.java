import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        leftUp(graphics);
        rightUp(graphics);
        leftDown(graphics);
        rightDown(graphics);


    }
    public static void leftUp(Graphics graphics) {
        int x = 0;
        int y = 0;
        int x1 = 0;
        int y1 = 0;

        for (int i = 0; i < WIDTH / 2; i += WIDTH / 32) {
            graphics.setColor(new Color(140, 0, 211));
            graphics.drawLine(i + x, y, WIDTH / 2, i + y1);
        }
        for (int j = 0; j < HEIGHT / 2; j += HEIGHT / 34) {
            graphics.setColor(Color.green);
            graphics.drawLine(x, j + y, j + x1, HEIGHT / 2);
        }
    }

    public static void rightUp(Graphics graphics) {
        int x = 0;
        int y = 0;
        int x1 = 0;
        int y1 = 0;

        for (int i = 0; i < WIDTH / 2; i += WIDTH / 32) {
            graphics.setColor(new Color(140, 0, 211));
            graphics.drawLine(i + WIDTH / 2, y, WIDTH, i + y1);
        }
        for (int j = 0; j < HEIGHT / 2; j += HEIGHT / 34) {
            graphics.setColor(Color.green);
            graphics.drawLine(WIDTH / 2, j + y, j + WIDTH / 2, HEIGHT / 2);
        }
    }

    public static void leftDown(Graphics graphics) {
        int x = 0;
        int y = 0;
        int x0 = 0;
        int y1 = 0;

        for (int i = 0; i < WIDTH / 2; i += WIDTH / 32) {
            graphics.setColor(new Color(140, 0, 211));
            graphics.drawLine(x + i, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + i);
        }
        for (int j = 0; j < HEIGHT / 2; j += HEIGHT / 34) {
            graphics.setColor(Color.green);
            graphics.drawLine(x, HEIGHT / 2 + j, x + j, HEIGHT);
        }
    }

    public static void rightDown(Graphics graphics) {
        int x = 0;
        int y = 0;
        int x1 = 0;
        int y1 = 0;

        for (int i = 0; i < WIDTH / 2; i += WIDTH / 32) {
            graphics.setColor(new Color(140, 0, 211));
            graphics.drawLine(WIDTH / 2 + i, HEIGHT / 2, WIDTH, HEIGHT / 2 + i);
        }
        for (int j = 0; j < WIDTH / 2; j += HEIGHT / 34) {
            graphics.setColor(Color.green);
            graphics.drawLine(WIDTH / 2, HEIGHT / 2 + j, WIDTH / 2 + j, HEIGHT);
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