import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KarakterRakamAyristir extends JFrame {
    //Soru : JtextField'e girilen metin içerisindeki rakmaları Jlabel1'e karakterleri Jlabe2'e
    // yazan java gui kodunu yazınız.
    JTextField t = new JTextField();
    JButton btn = new JButton("Ayrıştır");
    JLabel l1 = new JLabel("Sayılar:");
    JLabel l2 = new JLabel("Karakterler:");

    KarakterRakamAyristir() {
        t.setBounds(50, 100, 200, 30);
        btn.setBounds(260, 100, 90, 30);
        l1.setBounds(50, 140, 250, 30);
        l2.setBounds(50, 180, 250, 30);
        btn.setFocusable(false);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = t.getText();
                String sayiStr = "";
                String karStr = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        sayiStr += str.charAt(i) + ", ";
                    } else karStr += str.charAt(i) + ", ";
                }
                l1.setText("Sayılar:" + sayiStr);
                l2.setText("Karakterler:" + karStr);
            }
        });

        this.add(t);
        this.add(btn);
        this.add(l1);
        this.add(l2);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new KarakterRakamAyristir();
    }
}
