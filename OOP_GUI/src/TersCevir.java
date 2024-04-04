import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TersCevir extends JFrame {
    /*
    Soru: Kullanıcının girdiği bir metni tersine çeviren bir GUI uygulaması geliştirmeniz gerekiyor.
    Kullanıcı bir metin girer ve "Tersine Çevir" düğmesine bastığında, girilen metnin tersine çevrilmiş
    hali bir metin kutusunda görüntülenmelidir. Bu metin tersine çevirme GUI uygulamasını nasıl oluşturursunuz?
    */
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JButton b1 = new JButton("Çevir");
    JLabel l1 = new JLabel("Girilen Stringi Tersine Çeviren Program");

    public TersCevir() {
        t1.setBounds(100, 100, 200, 30);
        t2.setBounds(100, 200, 200, 30);
        l1.setBounds(80, 50, 260, 30);
        b1.setBounds(150, 150, 100, 30);
        t2.setEditable(false);
        b1.setFocusable(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder tersi = new StringBuilder();
                for (int i = t1.getText().length() - 1; i >= 0; i--) {
                    tersi.append(t1.getText().charAt(i));
                }
                t2.setText(tersi.toString());
            }
        });

        this.add(l1);
        this.add(t1);
        this.add(t2);
        this.add(b1);
        this.setLayout(null);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TersCevir();
    }
}