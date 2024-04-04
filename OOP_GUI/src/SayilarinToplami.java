import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SayilarinToplami extends JFrame implements ActionListener {
    /*
    Örnek3: aşşağıdaki formun yandaki kodda oluşturulduğu varsayılıyor butonlar için ortak bir dinleyici metot
    oluşturulmuştur(actionPerformed) 1,2,3 ve 4 tuşlarından birine basılınca tuş üzerindeki bilgi JTextField'e
    eklenmektedir. Kontrol butonuna tıklandığında ise JTextField'taki sayının rakamları toplamı JLabel'e yazdırılmaktadır
    ilgili java kodunu yazınız.
    */ JTextField t = new JTextField();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("Kontrol");
    JLabel l = new JLabel("Sayıların Toplamı: ");

    public SayilarinToplami() {
        t.setBounds(94, 100, 200, 30);
        b1.setBounds(40, 50, 70, 30);
        b2.setBounds(120, 50, 70, 30);
        b3.setBounds(200, 50, 70, 30);
        b4.setBounds(280, 50, 70, 30);
        b5.setBounds(145, 140, 100, 30);
        l.setBounds(135, 180, 150, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(l);
        this.add(t);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "1":
                t.setText(t.getText() + "1");
                break;
            case "2":
                t.setText(t.getText() + "2");
                break;
            case "3":
                t.setText(t.getText() + "3");
                break;
            case "4":
                t.setText(t.getText() + "4");
                break;
            case "Kontrol":
                String yazilcak = t.getText();
                int toplam = 0;
                for (int i = 0; i < yazilcak.length(); i++) {
                    toplam += yazilcak.charAt(i) - 48;
                }
                l.setText("Sayiların Toplamı: " + toplam);
                break;
        }
    }

    public static void main(String[] args) {
        SayilarinToplami o = new SayilarinToplami();
    }
}

