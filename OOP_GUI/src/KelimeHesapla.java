import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KelimeHesapla extends JFrame {
    /*
    soru : JtextArea'a girilen kelimeleri hesaplayan ve toplam kaç tane karakter
    kullandığını ekrana yazan gui programını yazınız.
     */

    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JTextArea area = new JTextArea();
    JButton btn = new JButton("Hesapla");

    KelimeHesapla() {
        l1.setBounds(100, 25, 100, 30);
        l2.setBounds(210, 25, 100, 30);
        area.setBounds(20, 75, 350, 200);
        area.setLineWrap(true);
        area.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        btn.setBounds(135, 300, 120, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                String[] words = text.split("\\s");
                l1.setText("Kelime: " + words.length);
                l2.setText("Karakter: " + text.length());
            }
        });

        this.add(l1);
        this.add(l2);
        this.add(area);
        this.add(btn);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new KelimeHesapla();
    }
}
