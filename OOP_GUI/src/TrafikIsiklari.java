import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Panel extends JPanel{
    //  • Trafik ışıkları animasyonu
    private int lightState = 0;
    private Timer timer;
    Panel() {
        this.setPreferredSize(new Dimension(500, 700));
        setVisible(true);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lightState = (lightState + 1) % 4;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Trafik ışığının dikdörtgeni(siyah).
        g.setColor(Color.black);
        g.fillRect(150, 50, 200, 600);
        g.setColor(Color.white);
        g.fillOval(201, 101, 100, 100);
        g.fillOval(201, 301, 100, 100);
        g.fillOval(201, 501, 100, 100);
        // Trafik ışıkları
        switch (lightState) {
            case 1:
                g.setColor(Color.red);
                g.fillOval(201, 101, 100, 100);
                break;
            case 2:
                g.setColor(Color.yellow);
                g.fillOval(201, 301, 100, 100);
                break;
            case 3:
                g.setColor(Color.green);
                g.fillOval(201, 501, 100, 100);
                break;

        }
    }
}

public class TrafikIsiklari extends JFrame {
    TrafikIsiklari(){
        this.setTitle("Trafik Işığı Animasyonu");
        this.add(new Panel());
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);//açılan panelin ortada açılmasını sağlar.
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//açılan panelin çıkış işaretine basılınca programın sonlanmasını sağlar!
    }
    public static void main(String[] args) {
        new TrafikIsiklari();
    }
}
