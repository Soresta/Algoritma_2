import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sayacim extends JPanel implements Runnable, ActionListener {
    /*
     • kontrol butonları olan bir sayaç! (gui,thread)
     */

    int sayacSaniye = 0;
    int sayacSalise = 0;
    int sayacDakka = 0;
    boolean isPaused = false;
    int randomSayi = 0;
    Color colors[] = {new Color(0xE2D1F9),Color.red,Color.cyan,Color.black,Color.green,Color.white,Color.yellow,Color.magenta,Color.BLUE};
    Font font = new Font("High Tower Text", Font.PLAIN, 70);

    public Sayacim() {
        new Thread(Thread.currentThread()).start();

        JButton button1 = new JButton("Yeniden Başlat");
        JButton button2 = new JButton("Duraklat");
        JButton button3 = new JButton("Devam Ettir");

        // Button 1
        button1.setBackground(new Color(52, 152, 219));
        button1.setForeground(Color.WHITE);
        button1.setFocusPainted(false);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(75, 50, 120, 40);

        // Button 2
        button2.setBackground(new Color(231, 76, 60));
        button2.setForeground(Color.WHITE);
        button2.setFocusPainted(false);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setBounds(225, 50, 120, 40);

        // Button 3
        button3.setBackground(new Color(46, 204, 113));
        button3.setForeground(Color.WHITE);
        button3.setFocusPainted(false);
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setBounds(375, 50, 120, 40);

        add(button1);
        add(button2);
        add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        setLayout(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        this.setBackground(colors[randomSayi]);

        g.setFont(font);
        g.setColor(Color.darkGray);
        g.fillRect(183, 168, 225, 99);
        g.setColor(new Color(0x317773));
        g.fillRect(185, 170, 220, 95);
        g.setColor(Color.white);
        g.drawString(String.valueOf(sayacDakka) + ":" + String.valueOf(sayacSaniye) + "," + String.valueOf(sayacSalise), getWidth() / 2 - 80, getHeight() / 2 + 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sayaç");
        Sayacim time = new Sayacim();
        Thread timer = new Thread(time);
        timer.start();
        frame.add(time);
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(9);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (!isPaused) {
                sayacSalise += 1;

                if (sayacSalise == 100) {
                    sayacSaniye++;
                    sayacSalise = 0;
                }

                if (sayacSaniye == 60) {
                    sayacDakka++;
                    sayacSaniye = 0;
                    sayacSalise = 0;
                }

                if (sayacSaniye%3==0 && sayacSalise == 0){
                    randomSayi ++;
                    if (randomSayi ==9)randomSayi =0;
                }
            }
            repaint();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Yeniden Başlat")) {
            sayacDakka = 0;
            sayacSaniye = 0;
            sayacSalise = 0;
            isPaused = false;
        } else if (command.equals("Duraklat")) {
            isPaused = true;
        } else if (command.equals("Devam Ettir")) {
            isPaused = false;
        }
    }
}

