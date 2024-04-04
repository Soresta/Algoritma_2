import javax.swing.*;
import java.awt.*;

public class KareIcindeDaire extends JFrame {
    //bir kare içinde daire çiziniz!
    KareIcindeDaire() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(39, 168, 19));
        g.drawRect(100, 100, 200, 200);
        g.drawOval(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        new KareIcindeDaire();
    }
}
