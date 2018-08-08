import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        drawSquare(graphics, 50, Color.green);


    }
    public static void drawSquare(Graphics graphics, int size, Color squareColor) {
        int x = 0;
        int y = 0;
        graphics.setColor(squareColor);
        for(int i = 7; i >= 1; i--) {
            graphics.fillRect((WIDTH/2) - (i * size/2),  (HEIGHT/2) - (i * size/2), i * size, i * size);
            if(i == 1) {
                graphics.setColor(Color.red);
            } else if(i == 2) {
                graphics.setColor(Color.orange);
            } else if(i == 3) {
                graphics.setColor(Color.yellow);
            } else if (i == 4){
                graphics.setColor(Color.green);
            } else if (i == 5) {
                graphics.setColor(Color.blue);
            } else if (i == 6) {
                graphics.setColor(Color.cyan);
            } else if (i == 7) {
                graphics.setColor(Color.magenta);
            }
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