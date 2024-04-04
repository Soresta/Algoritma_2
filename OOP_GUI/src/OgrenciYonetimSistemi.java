import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
    /*
    Örnek2: Aşagdaki formda EKLE butonuna tıklandığında girilen NO,İSİM ve BÖLÜM bilgilerini ogrneci.txt dosyasina
    yazdiran ve ARA butonuna tıklandığında ise seçilen  bölümdeki öğrenci bilgilerini konsol ekranında gösteren
    kodları yazınız!
     */

public class OgrenciYonetimSistemi extends JFrame implements ActionListener {
    File dosya = new File("txt dosyanızın yolu!");
    String[] bolumler = {"Bilgisayar Mühendisliği", "Yazilim Mühendisliği", "Adli Bilişim", "Hukuk"};
    JButton btn1 = new JButton("Ekle");
    JButton btn2 = new JButton("Ara");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JLabel l1 = new JLabel("No:");
    JLabel l2 = new JLabel("İsim:");
    JLabel l3 = new JLabel("Bölüm:");
    JComboBox cb = new JComboBox(bolumler);

    public OgrenciYonetimSistemi() {
        l1.setBounds(50, 50, 40, 40);
        l2.setBounds(50, 130, 40, 40);
        l3.setBounds(50, 200, 40, 40);
        t1.setBounds(100, 50, 200, 40);
        t2.setBounds(100, 130, 200, 40);
        t3.setBounds(100, 200, 200, 40);
        btn1.setBounds(320, 130, 100, 40);
        btn2.setBounds(320, 270, 100, 40);
        cb.setBounds(100, 270, 200, 40);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn1.setFocusable(false);
        btn2.setFocusable(false);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(btn1);
        this.add(btn2);
        this.add(cb);
        this.setSize(500, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "Ekle":
                String icerik = t1.getText() + " " + t2.getText() + " " + t3.getText();
                t1.setText("");
                t2.setText("");
                t3.setText("");
                try {
                    FileWriter fw1 = new FileWriter(dosya, true);
                    fw1.write(icerik + "\n");
                    fw1.close();
                } catch (IOException ex) {
                    ex.getMessage();
                }
                break;
            case "Ara":
                try {
                    Scanner scanner = new Scanner(dosya);
                    while (scanner.hasNext()) {
                        String satir = scanner.nextLine();
                        if (satir.contains(cb.getSelectedItem().toString())) {
                            System.out.println(satir);
                        }
                    }
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                break;
        }
    }

    public static void main(String[] args) {
        OgrenciYonetimSistemi o = new OgrenciYonetimSistemi();
    }
}