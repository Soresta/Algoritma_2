import javax.swing.*;
import java.awt.*;

public class RenkDegistirmeAnimasyonu extends JFrame {
    //Renk değiştirien bir daire ve kare animasyonları!(thread ve gui)
    RenkDegistirmeAnimasyonu() {
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(100, 100, 200, 200);
        g.setColor(Color.MAGENTA);
        g.fillOval(300, 300, 300, 300);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        g.setColor(Color.yellow);
        g.fillRect(100, 100, 200, 200);
        g.setColor(Color.cyan);
        g.fillOval(300, 300, 300, 300);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 200);
        g.setColor(Color.pink);
        g.fillOval(300, 300, 300, 300);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();//jframe içinde bulunmaktadır!
    }

    public static void main(String[] args) {
        new RenkDegistirmeAnimasyonu();
    }

}
