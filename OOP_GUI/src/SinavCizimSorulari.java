import javax.swing.*;
import java.awt.*;

public class SinavCizimSorulari extends JFrame {
    /*
        1-ooooooo şeklini çiziniz.
        2- _|¯|_ şeklini çiziniz.
        3- iç içe girmiş daireler çiziniz.
     */
    SinavCizimSorulari() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int xb = 0;
        int yb = 200;
        for (int i = 0; i <= this.getWidth(); i += 50) {
            Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            g.setColor(color);
            g.fillOval(i, 50, 50, 50);
        }

        while (xb < this.getWidth()) {
            g.drawLine(xb, yb, xb + 50, yb);
            g.drawLine(xb + 50, yb, xb + 50, yb - 50);
            g.drawLine(xb + 50, yb - 50, xb + 100, yb - 50);
            g.drawLine(xb + 100, yb - 50, xb + 100, yb);
            xb += 100;
        }

        for (int i = 100; i > 0; i -= 10) {
            Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            g.setColor(color);
            g.fillOval(250 - i, 350 - i, 20 + 2 * i, 20 + 2 * i);

        }
    }

    public static void main(String[] args) {
        new SinavCizimSorulari();
    }
}
