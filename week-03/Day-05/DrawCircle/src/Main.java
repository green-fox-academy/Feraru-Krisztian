import javax.swing.*;
import java.awt.*;

public class Main extends JComponent {



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 0;
        int y = 0;
        int size = 1000;
        int max = 5;

        g.drawOval(x, y, size, size);
        drawCircles(g, x, y, size, max);


    }

    private void drawCircles(Graphics g, int x, int y, int size, int max){

        g.drawOval(x + size /4, y, size / 2, size / 2);
        g.drawOval(x, y + size / 4 + size / 20, size / 2, size / 2);
        g.drawOval(x + size / 2 , y + size / 4 + size / 20, size / 2, size / 2);
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
