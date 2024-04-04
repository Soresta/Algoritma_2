import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiklanmaSayisiHesapla extends JFrame {
    // Soru:Gui kullanarak bir buttona kaç kere tıklandığını ekrana yazan programı yazınız.
    int tiklanmaSayisi = 0;
    JPanel panel = new JPanel();
    JButton btn = new JButton("Tıkla");
    JLabel label = new JLabel(" .kez tıklandı!");

    TiklanmaSayisiHesapla() {
        //bileşen konumlandırma ve boyut ayarlama
        panel.setPreferredSize(new Dimension(200, 200));
        label.setBounds(50, 100, 100, 30);
        btn.setBounds(50, 50, 100, 30);
        btn.setFocusable(false);
        //butona bir görev atama(tıklayınca etkileşime girmesi için)
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiklanmaSayisi++;
                label.setText(tiklanmaSayisi + label.getText().substring(label.getText().indexOf(".")));
            }
        });

        //bileşenleri panele ekleme
        panel.add(btn);
        panel.add(label);
        panel.setLayout(null);

        //ana pencere ayarları
        this.setTitle("Tıklama hesaplayıcı");
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

    public static void main(String[] args) {
        new TiklanmaSayisiHesapla();
    }
}
