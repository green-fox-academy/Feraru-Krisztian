import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        rectangle(graphics, 0, 0);
    }
    public static void rectangle(Graphics graphics, int x, int y) {
        int a = 50;
        for (int i = 1; i <= 4; i++) {
            graphics.drawRect(x, y, i * a, i * a);
            if(i == 1) {
                graphics.setColor(Color.red);
            } else if(i == 2) {
                graphics.setColor(Color.green);
            } else if(i == 3) {
                graphics.setColor(Color.blue);
            }else {
                graphics.setColor(Color.black);
            }
        }
    }

    //    Don't touch the code below
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