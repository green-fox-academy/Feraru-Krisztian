import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        lines(graphics, 0 , 0);
    }
    public static void lines(Graphics graphics, int x, int y) {
        for (int i = 0; i < WIDTH ; i = i + 20) {
            graphics.drawLine(x + i, y, WIDTH / 2, HEIGHT / 2);
        }
        for(int j = 0; j < HEIGHT; j = j + 20){
            graphics.drawLine(x , y + j, WIDTH / 2, HEIGHT / 2);
        }
        for(int k = WIDTH; k > 0; k = k - 20) {
            graphics.drawLine(x + k, HEIGHT, WIDTH / 2, HEIGHT / 2);
        }
        for(int l = HEIGHT; l > 0; l = l - 20) {
            graphics.drawLine(WIDTH, y + l, WIDTH / 2, HEIGHT / 2);
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