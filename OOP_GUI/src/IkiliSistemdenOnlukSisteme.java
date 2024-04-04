import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IkiliSistemdenOnlukSisteme extends JFrame implements ActionListener {
    //soru: İkili tabandan onluk tabana çeviren java gui programı yazınız.

    //Bileşenler(Components)!
    JButton btn1 = new JButton("0");
    JButton btn2 = new JButton("1");
    JButton btn3 = new JButton("Sil");
    JButton btn4 = new JButton("Çevir");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JLabel l1 = new JLabel("İKİLİ SAYİYİ ONLU SAYIYA ÇEVİREN PROGRAM!");
    JLabel l2 = new JLabel("Onluk: ");

    //Oluşturucu(Constructor)
    public IkiliSistemdenOnlukSisteme() {
        //penceremizde bileşenleri konumlandırma işlemleri
        t1.setBounds(200, 200, 150, 30);
        t2.setBounds(200, 300, 150, 30);
        btn1.setBounds(200, 240, 40, 30);
        btn2.setBounds(260, 240, 40, 30);
        btn3.setBounds(120, 200, 70, 30);
        btn4.setBounds(40, 200, 70, 30);
        l1.setBounds(130, 160, 300, 30);
        l2.setBounds(150, 300, 130, 30);
        t2.setEditable(false);
        t1.setEditable(false);

        //Frame bileşenleri ekleme
        getContentPane().add(t1);//this.add(t1) kodu ile aynıdır!
        getContentPane().add(t2);
        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(btn3);
        getContentPane().add(btn4);

        //buttonlara bir dinleyici atama(actionListener)
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        //pencere ayarları
        setLocationRelativeTo(null);//bu kodaçılan pencereyi bilgisayar ortasına yerleştirmeye yarıyor
        setSize(600, 600);//açılan pencere boyutu
        setDefaultCloseOperation(EXIT_ON_CLOSE);//açılan pencereyi sağ koşede bulunan x düşmesine basılınca
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);//pencereyi görünür kılar
    }

    public static void main(String[] args) {
        new IkiliSistemdenOnlukSisteme();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String islem = e.getActionCommand();
        String koyulcak = t1.getText();
        switch (islem) {
            case "1":
                koyulcak += "1";
                t1.setText(koyulcak);
                break;

            case "0":
                koyulcak += "0";
                t1.setText(koyulcak);
                break;

            case "Çevir":
                String binary = t1.getText();
                int decimal = 0;
                int power = 0;
                // String'i tersten gezerek her bir basamağı 2'nin üssüyle çarparak toplamı hesapla
                for (int i = binary.length() - 1; i >= 0; i--) {
                    int digit = Character.getNumericValue(binary.charAt(i));
                    decimal += digit * Math.pow(2, power);
                    power++;
                }
                t2.setText(String.valueOf(decimal));
                break;

            case "Sil":
                if (!t1.getText().equals("")) {
                    int uzunluk = t1.getText().length();
                    t1.setText(t1.getText().substring(0, uzunluk - 1));
                }
                break;
        }
    }
}
