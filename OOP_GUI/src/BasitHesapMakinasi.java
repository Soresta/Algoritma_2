import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BasitHesapMakinasi extends JFrame {
    //toplama, çıkarma, çarpma, bölme işlemlerini yapan basit bir hesap makinası yapınız.
    JButton toplama = new JButton("+");
    JButton cikarma = new JButton("-");
    JButton carpma = new JButton("x");
    JButton bolme = new JButton("÷");

    JButton[] buttons = {toplama, carpma, cikarma, bolme};
    JTextField sayi1 = new JTextField();
    JTextField sayi2 = new JTextField();
    JTextField sonuc = new JTextField();

    BasitHesapMakinasi() {
        //bileşenleri konumlandırma ve küçük ayarlar..
        toplama.setBounds(70, 300, 50, 50);
        cikarma.setBounds(140, 300, 50, 50);
        carpma.setBounds(210, 300, 50, 50);
        bolme.setBounds(280, 300, 50, 50);
        sayi1.setBounds(100, 100, 200, 40);
        sayi2.setBounds(100, 150, 200, 40);
        sonuc.setBounds(100, 200, 200, 40);
        sonuc.setEditable(false);

        //giriş alanlarının tasarımı..
        sayi1.setBorder(BorderFactory.createLineBorder(null)); // Kenarlık rengi
        sayi1.setBackground(new Color(169, 139, 139)); // Arka plan rengi
        sayi1.setForeground(Color.white); // Metin rengi
        sayi1.setFont(new Font("Arial", Font.PLAIN, 18)); // Metin fontu
        sayi2.setBorder(BorderFactory.createLineBorder(null));
        sayi2.setBackground(new Color(169, 139, 139)); // Arka plan rengi
        sayi2.setForeground(Color.white);
        sayi2.setFont(new Font("Arial", Font.PLAIN, 18));
        sonuc.setBorder(BorderFactory.createLineBorder(null));
        sonuc.setBackground(new Color(77, 64, 64)); // Arka plan rengi
        sonuc.setForeground(Color.white);
        sonuc.setFont(new Font("Arial", Font.PLAIN, 18));


        //giriş alanlarına sadece sayı girmesine izin verir!
        sayi1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        sayi2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        //dinleyici(buttonlara basılınca olucak işlemleri yazıyoruz!)
        ActionListener commonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(sayi1.getText().equals("") || sayi2.getText().equals(""))) {
                    int value1 = Integer.parseInt(sayi1.getText());
                    int value2 = Integer.parseInt(sayi2.getText());
                    int result = 0;
                    if (e.getSource() == toplama) {
                        result = value1 + value2;
                    } else if (e.getSource() == cikarma) {
                        result = value1 - value2;
                    } else if (e.getSource() == carpma) {
                        result = value1 * value2;
                    } else if (e.getSource() == bolme) {
                        if (value2 != 0) {
                            double resultDouble = (double) value1 / value2;
                            sonuc.setText(String.valueOf(resultDouble));
                            return;
                        } else {
                            sonuc.setText("Bölme işlemi sıfıra bölünemez!");
                            return;
                        }
                    }
                    sonuc.setText(String.valueOf(result));
                }
            }
        };

        //buttonlara ortak görevler ve tasarımlar ..
        for (JButton btn : buttons) {
            btn.setFont(new Font("Arial", Font.PLAIN, 20));
            btn.setForeground(Color.WHITE);
            btn.setBackground(new Color(63, 114, 155));
            btn.setFocusPainted(false);
            btn.addActionListener(commonActionListener);
        }

        //anaPencere ayarları..
        this.getContentPane().setBackground(new Color(255, 204, 153)); // Örnek olarak turuncu bir renk
        getContentPane().add(toplama);
        getContentPane().add(cikarma);
        getContentPane().add(carpma);
        getContentPane().add(bolme);
        getContentPane().add(sayi1);
        getContentPane().add(sayi2);
        getContentPane().add(sonuc);
        this.setTitle("Basit Hesap Makinası");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BasitHesapMakinasi();
    }
}
