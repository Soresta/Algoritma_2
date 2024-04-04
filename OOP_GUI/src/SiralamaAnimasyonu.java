import javax.swing.*;
import java.awt.*;


class SiralamaPaneli extends JPanel implements Runnable {
    /*
    Sıralama algoirtması olan selection sort sıralamasının görselleştirilmiş hali (animasyonu) Gui
    Kullanılarak yapılmıştır.
     */
    //değişkenler
    boolean siralanmadi = true;//siralama işleminin bitip bitmediğini kontrol eden değişken
    Color mycolor = Color.red;//çizim rengi
    static JButton btnBaslat = new JButton("Başlat");
    static JButton btnKaristir = new JButton("Karistir");
    int[] uzunluklar = new int[40];//oluştulcak uzunlukların listesi
    boolean[] siralanmisUzunluklar = new boolean[40];//oluştulcak uzunlukların doğru konumda olduğunu kontrol eden liste

    public void olustur() {//uzunlukları rastgele oluşturan ve listelere yerleştiren metot
        for (int i = 0; i < 40; i++) {
            int sayi = (int) (Math.random() * 400 + 30);
            uzunluklar[i] = sayi;
            siralanmisUzunluklar[i] = false;
        }
        siralanmadi = true;
        repaint();
    }

    SiralamaPaneli() {
        //buttonların görevlerini atama ve ayarlama işlemleri:
        btnBaslat.setPreferredSize(new Dimension(100, 40));
        btnBaslat.setBackground(Color.green);
        btnBaslat.setForeground(Color.BLACK);
        btnBaslat.setFont(new Font("Arial", Font.BOLD, 14));
        btnBaslat.setFocusable(false);

        btnKaristir.setPreferredSize(new Dimension(100, 40));
        btnKaristir.setBackground(Color.YELLOW);
        btnKaristir.setForeground(Color.BLACK);
        btnKaristir.setFont(new Font("Arial", Font.BOLD, 14));
        btnKaristir.setFocusable(false);

        btnKaristir.addActionListener(e -> olustur());
        btnBaslat.addActionListener(e -> new Thread(SiralamaPaneli.this).start());

        olustur();
        this.setBackground(Color.black);
    }

    public void paint(Graphics g) {//çizim metodu
        super.paint(g);
        for (int i = 0, x = 10; i < 40; i++, x += 10) {
            for (int j = 0; j < 40; j++) {
                if (siralanmisUzunluklar[i] && uzunluklar[i] >= uzunluklar[j] ) {
                    g.setColor(mycolor);
                } else {
                    g.setColor(Color.red);
                }
            }
            g.drawLine(x, getHeight(), x, getHeight() - uzunluklar[i]);
        }
    }

    @Override
    public void run() {
        while (siralanmadi) {
            //siralama işlmelerini yapan ve tekrar çizimi tetikleyen kısım
            for (int i = 0; i < 40; i++) {
                for (int j = 0; j < 40; j++) {
                    if (uzunluklar[i] > uzunluklar[j]) {
                        int yedek = uzunluklar[j];
                        uzunluklar[j] = uzunluklar[i];
                        uzunluklar[i] = yedek;
                        mycolor = Color.blue;
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    repaint();
                }
                siralanmisUzunluklar[i] = true;
            }
            siralanmadi = false;
        }
    }
}

public class SiralamaAnimasyonu extends JFrame {
    SiralamaAnimasyonu() {
        //panelleri oluşturma ve ayarlama işlemleri:
        JPanel panel1 = new JPanel();
        SiralamaPaneli panel2 = new SiralamaPaneli();
        panel2.setPreferredSize(new Dimension(410, 450));
        panel1.setPreferredSize(new Dimension(410, 50));
        panel1.add(SiralamaPaneli.btnBaslat);
        panel1.add(SiralamaPaneli.btnKaristir);
        panel1.setBackground(Color.BLACK);

        //ana pencere ayarları(frame):
        Dimension ekranBoyutu = Toolkit.getDefaultToolkit().getScreenSize();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        this.setLayout(new GridBagLayout());
        this.add(panel1, gbc);
        gbc.gridy = 1;
        this.add(panel2, gbc);
        this.setVisible(true);
        this.setTitle("Siralama Algoritması Animasyonu");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocation(ekranBoyutu.width / 2 - 225, ekranBoyutu.height / 2 - 250);
        this.pack();
    }

    public static void main(String[] args) {
        new SiralamaAnimasyonu();
    }
}