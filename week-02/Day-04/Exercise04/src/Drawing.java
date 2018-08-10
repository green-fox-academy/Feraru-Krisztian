import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        for (int i = 0; i < 125; i++) {
            int starColor =(int) (50 + (Math.random() * 206));
            Color color = new Color(starColor, starColor, starColor);
            graphics.setColor(color);
            graphics.fillRect((int) (Math.random() * WIDTH), (int) (Math.random() * HEIGHT), ((int)(Math.random() * 5)), ((int)(Math.random() * 5)));
        }
    }

    // Don't touch the code below
    static int WIDTH = 1320;
    static int HEIGHT = 1343;

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
