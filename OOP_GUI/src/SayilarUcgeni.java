import javax.swing.*;
import java.awt.*;

public class SayilarUcgeni extends JFrame {
    /*
    Soru: aşşağıdaki şekli Gui ile çiziniz:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7
        1 2 3 4 5 6 7 8
        1 2 3 4 5 6 7 8 9
        1 2 3 4 5 6 7 8 9 10
     */
    SayilarUcgeni() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        Font myFont = new Font("calbiri", 0, 30);
        g.setFont(myFont);
        int y = 100;
        for (int i = 1; i < 11; i++) {
            int x = 60;
            for (int j = 1; j <= i; j++) {
                g.drawString(j + " ", x, y);
                x += 25;
            }
            y += 25;
        }
    }

    public static void main(String[] args) {
        new SayilarUcgeni();
    }
}
