import javax.swing.*;
import java.awt.*;

public class DrawMetotlari extends JFrame {
    //genel draw çizim metotları içerir
    //NOT: çizimler yukardan aşşağı sıralanmıştır!
    DrawMetotlari() {
        this.setSize(500, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Sorest", 225, 50);//yazı
        g.drawLine(0, 70, this.getWidth(), 70);//çizgi
        g.drawOval(200, 90, 100, 100);//oval
        g.drawRect(200, 210, 100, 100);//dörtgen
        g.drawArc(100, 350, 100, 100, 90, 270);//yay
        g.drawArc(300, 350, 100, 100, 0, 120);//yay
        g.drawRoundRect(200, 450, 100, 100, 50, 50);//yuvarlak dörtgen
        g.drawImage(new ImageIcon("resim dosyanızın yolu(path)").getImage(), 230, 600, null);//resim
    }

    public static void main(String[] args) {
        new DrawMetotlari();
    }
}
