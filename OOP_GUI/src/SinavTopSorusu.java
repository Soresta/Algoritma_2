import javax.swing.*;
import java.awt.*;

public class SinavTopSorusu extends JFrame {
    /*
       soru : ekrana aşşağıdaki resimi çiziniz:
        OOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOO
        OOOOOOOOOOOOOOOOOOOOO
     */
    SinavTopSorusu(){
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }
    public void paint(Graphics g) {
        int uzunluk = getWidth();
        int yukseklik = getHeight();
        for (int i = 0; i < uzunluk; i = i + 30) {
            for (int j = 0; j < yukseklik; j = j + 30) {
                g.drawOval(i, j, 30, 30);
            }
        }
    }

    public static void main(String[] args) {
        new SinavTopSorusu();
    }
}
