import javax.swing.*;
import java.awt.*;

public class FillMetotlari extends JFrame {
    //genel fill çizim metotları içerir
    //NOT: çizimler yukardan aşşağı sıralanmıştır!
    FillMetotlari() {
        this.setSize(500, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        g.fillOval(200, 90, 100, 100);//oval
        g.fillRect(200, 210, 100, 100);//dörtgen
        g.fillArc(100, 350, 100, 100, 90, 270);//yay
        g.fillArc(300, 350, 100, 100, 0, 120);//yay
        g.fillRoundRect(200, 450, 100, 100, 50, 50);//Yuvarlak Dikdörtgen
        int[] x = {150, 250, 350, 240};//x noktaları(çokgen için)
        int[] y = {680, 550, 680, 630};//y noktaları(çokgen için)
        g.fillPolygon(x, y, 4);//çokgen
    }

    public static void main(String[] args) {
        new FillMetotlari();
    }
}

