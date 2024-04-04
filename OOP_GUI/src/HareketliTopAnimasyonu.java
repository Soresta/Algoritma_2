import javax.swing.*;
import java.awt.*;

public class HareketliTopAnimasyonu extends JFrame implements Runnable {
    /*
    Soru: ekranda rasgtele hareket eden 2 topun animasyonunu yapınız.
    önemli not: Jframe'in üzerine direkt çizdiğimiz için hafif beyaz ekran titremeleri oluşabilir
    bunu çözmek için bir Panel(jpanel) üzerinde çizim yapılabilir ve thread yerin timer classları kullanılabilir
    tekerlek animasyonu örneğindeki gibi.
     */
    //topların konumları ve yaricapi
    int x = 300, y = 300, yaricap = 30;
    int x1 = 200, y1 = 200;
    //mesafe değişkenini oluşturuyoruz 2 top çarpışmasını kontrol etmek için!
    double mesafe;
    //toplara hareket etmeleri için rastgele bir hız atıyoruz.
    int dx = (int) (Math.random() * 15 + 1), dy = (int) (Math.random() * 14 + 1);
    int dx1 = (int) (Math.random() * 15 + 1), dy1 = (int) (Math.random() * 14 + 1);

    //2 top çarpışmasını kontrol eden metot
    public boolean carpisma() {
        mesafe = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
        return mesafe <= 30;
    }

    //oluşturucu
    HareketliTopAnimasyonu() {
        JPanel panel = new JPanel() {
            public void paint(Graphics g) {
                //topların çizim işlemleri
                super.paint(g);
                g.setColor(Color.black);
                g.fillOval(x, y, yaricap, yaricap);
                g.fillOval(x1, y1, yaricap, yaricap);
            }
        };
        panel.setPreferredSize(new Dimension(600, 600));
        //thread başlangıcı
        new Thread(HareketliTopAnimasyonu.this).start();

        //anapencere(frame)ayarları.
        this.setTitle("Hareketli Top Animasyonu");
        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new HareketliTopAnimasyonu();
    }

    @Override
    public void run() {
        while (true) {
            //konum değiştirme işlemleri
            x += dx;
            x1 += dx1;
            y += dy;
            y1 += dy1;
            //çarpışma kontrolu
            if (carpisma()) {
                dx = -dx;
                dx1 = -dx1;
                dy = -dy;
                dy1 = -dy1;
                System.out.println("toplar çarpıştı");
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //topların pencere kenarlarına dokununca pencerede kalma işlemleri!
            if (x <= 0 || (x + dx + 30 >= 600)) dx = -dx;
            if (x1 <= 0 || (x1 + dx + 30 >= 600)) dx1 = -dx1;
            if (y <= 0 || (y + dy + 30 >= 600)) dy = -dy;
            if (y1 <= 0 || (y1 + dy + 30 >= 600)) dy1 = -dy1;
            repaint();
        }
    }
}