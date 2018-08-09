import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] box = {{10, 10}, {290, 10}, {290, 290} ,{10, 290}};
        int[][] lines = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        array(graphics, box);
        array(graphics, lines);

    }public static void array(Graphics graphics, int[][] list){
        graphics.setColor(Color.green);
        int x = 0;
        int y = 0;
        int x1 = 0;
        int y1 = 0;

        for (int i = 0; i < list.length; i++) {
            x = list[i][0];
            y = list[i][1];
            if (i + 1 >= list.length) {
                x1 = list[0][0];
                y1 = list[0][1];
            }else {
                x1 = list[i + 1][0];
                y1 = list[i + 1][1];
            }
            graphics.drawLine(x, y, x1, y1);
        }
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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


// create a 300x300 canvas.