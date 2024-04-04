import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KutuyuHareketEttir extends JFrame implements KeyListener {
    // soru :klavyeden A S D W tuşları ile hareket ettilebilen bir kare çiziniz.
    int xKonum = 400 / 2 - 25;
    int yKonum = 400 / 2 - 25;
    boolean kere = true;

    KutuyuHareketEttir() {
        this.addKeyListener(this);
        this.getContentPane().setBackground(new Color(0xE19438));
        this.setTitle("Kutu Hareket Ettirme");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.fillRect(xKonum, yKonum, 50, 50);
        g.setColor(Color.black);
        g.drawRect(xKonum - 1, yKonum - 1, 50, 50);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.cyan);
        if (kere) {
            g.drawString("→ D", this.getHeight() / 2 + 35, this.getHeight() / 2 + 5);
            g.drawString("↑ W", this.getHeight() / 2 - 15, this.getHeight() / 2 - 35);
            g.drawString("A ←", this.getHeight() / 2 - 75, this.getHeight() / 2 + 5);
            g.drawString("↓ S", this.getHeight() / 2 - 15, this.getHeight() / 2 + 45);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        kere = false;
        if (c == KeyEvent.VK_A)
            xKonum = xKonum - 10;
        else if (c == KeyEvent.VK_D)
            xKonum = xKonum + 10;
        else if (c == KeyEvent.VK_W)
            yKonum = yKonum - 10;
        else if (c == KeyEvent.VK_S)
            yKonum = yKonum + 10;
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new KutuyuHareketEttir();
    }
}
