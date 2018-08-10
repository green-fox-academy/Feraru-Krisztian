import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {

        int x = 0;
        int y = 0;
        int x1 = 0;
        int y1 = 0;

        for (int i = 0; i < WIDTH; i = i + 20) {
            graphics.setColor(new Color(140, 0, 211));
            graphics.drawLine(i + x, y, WIDTH, i + y1);
        }
        for (int j = 0; j < HEIGHT; j = j + 20) {
            graphics.setColor(Color.green);
            graphics.drawLine(x, j + y,j + x1, HEIGHT);
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
