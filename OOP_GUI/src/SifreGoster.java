import javax.swing.*;

public class SifreGoster extends JFrame {
    /*
        soru: klavyeden girilen bir şifreyi(girilirken gözükmeyecek şekilde olucak) göster butonuna
        basılınca gösteren bir java gui uygulaması yapınız.
     */
    JLabel l1 = new JLabel("Şifre");
    JButton btn = new JButton("Göster");
    JPasswordField pass = new JPasswordField();
    SifreGoster() {
        pass.setBounds(20, 50, 100, 30);
        l1.setBounds(20, 20, 100, 30);
        btn.setBounds(20, 80, 100, 30);
        btn.addActionListener(e -> {//lambda kullanışı
            String password = new String(pass.getPassword());
            l1.setText("Şifre: " + password);
        });

        this.add(pass);
        this.add(l1);
        this.add(btn);
        this.setSize(170, 170);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new SifreGoster();
    }
}
