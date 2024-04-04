import javax.swing.*;
import java.awt.*;

public class CizgilerArasiString extends JFrame {
    /*Aşşğıdaki şekli gui ile çiziniz:
    Şekil:
            ---------------------------------------
                Java Programlamaya Hoşgeldin
            ---------------------------------------
     */
    CizgilerArasiString() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("celbiri", 0, 18));
        g.drawLine(80, 200, 320, 200);
        g.drawString("Sihirdar Vadisine Hoşgeldin", 90, 220);
        g.drawLine(80, 230, 320, 230);
    }

    public static void main(String[] args) {
        new CizgilerArasiString();
    }
}
