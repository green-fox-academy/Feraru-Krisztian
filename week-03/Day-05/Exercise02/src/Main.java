import javax.swing.*;
import java.awt.*;

public class Main extends JComponent {

    private static int MAX_DEPTH = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 500;
        int y = 500;
        int size = 500;
        int height = (int) (Math.sqrt(3) / 2 * size);
        int depth = 0;

        drawTriangle(g, x, y, height, size);
        drawTreeTriangle(g, x, y, height, size, depth);

    }

    void drawTriangle(Graphics g, int x, int y, int height, int size) {
        g.drawLine(x - size / 2, y, x, y - height);
        g.drawLine(x, y - height, x + size / 2, y);
        g.drawLine(x + size / 2, y, x - size / 2, y);
    }

    public void drawTreeTriangle(Graphics g, int x, int y, int height, int size, int depth) {

        if (depth > MAX_DEPTH) {
            return;
        }

        drawTriangle(g, x / 2, y - height / 2, (int) (Math.sqrt(3) / 2 * (size / 2)), size / 2);
        drawTriangle(g, (x + size / 2), (y - height / 2), (int) (Math.sqrt(3) / 2 * (size / 2)), (size / 2));
        drawTriangle(g, x, (y + height / 2), height / 2, size / 2);

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Main main = new Main();
        main.setPreferredSize(new Dimension(1000, 1000));

        frame.getContentPane().add(main);

        frame.pack();
        frame.setVisible(true);
    }

}
