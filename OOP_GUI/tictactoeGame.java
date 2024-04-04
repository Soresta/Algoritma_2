import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tictactoeGame extends JFrame implements Runnable {
    boolean kazandi = false;
    String[][] yaniyorMu = new String[3][3];
    JPanel[][] kareler = new JPanel[3][3];
    Color[] renkler = {Color.RED, Color.BLUE}; // Renklerin sırasını tutan dizi
    int renkIndex = 0; // Mevcut renk indeksi

    //int aritlanY=130;
    public void oyunuYenile() {
        kazandi = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                kareler[i][j].setBackground(Color.white);
                yaniyorMu[i][j] = "";
                renkIndex = 0;
            }
        }
    }

    tictactoeGame() {
        setSize(400, 600);
        setLayout(new BorderLayout());

        JPanel panelCenter = new JPanel();
        JPanel panelTop = new JPanel();
        int margin = 30;
        panelCenter.setBorder(BorderFactory.createEmptyBorder(margin * 2, margin, margin * 2, margin));
        panelCenter.setLayout(new GridLayout(3, 3, 15, 15));

        JButton button = new JButton("Tekrar");

        button.setFocusable(false);
        button.setBackground(new Color(59, 89, 152)); // Düğme arkaplan rengi
        button.setForeground(Color.WHITE); // Düğme metin rengi
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button.setFont(new Font("Arial", Font.PLAIN, 16)); // Düğme metin yazı tipi ve boyutu
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusable(false);
        // Düğme üzerine gelince arka plan rengini değiştir
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(45, 75, 127)); // Yeni arka plan rengi
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(59, 89, 152)); // Normal arka plan rengi
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oyunuYenile();
            }
        });

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JPanel panel = new JPanel();
                panel.setBorder(new LineBorder(Color.BLACK, 5));
                panel.setBackground(Color.white);
                kareler[i][j] = panel;
                panelCenter.add(panel);
                panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (kazandi == false && panel.getBackground().equals(Color.WHITE)) {
                            panel.setBackground(renkler[renkIndex]);
                            //draw(panel.getLocation().x,panel.getLocation().y);
                            renkIndex = (renkIndex + 1) % renkler.length; // Renk indeksini döngüsel olarak güncelle
                        }
                    }
                });
            }
        }

        panelTop.setPreferredSize(new Dimension(getWidth(), (int) (getHeight() * 0.15)));
        panelTop.setBackground(new Color(0x7C4242));
        panelCenter.setBackground(new Color(0xCC6B6B));
        panelTop.setLayout(new GridBagLayout()); // GridBagLayout kullan

        // Dikey ortalamayı ayarlamak için bir GridBagConstraint kullan
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weighty = 1.0; // Y ekseni üzerindeki ağırlığı ayarla (dikeyde ortalamayı sağlar)
        panelTop.add(button, gbc);
        add(panelCenter, BorderLayout.CENTER);
        add(panelTop, BorderLayout.NORTH);

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        tictactoeGame fr = new tictactoeGame();
        Thread th = new Thread(fr);
        th.start();

    }

    public void run() {
        while (true) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (kareler[i][j].getBackground().equals(Color.BLUE)) yaniyorMu[i][j] = "Mavi";
                    else if (kareler[i][j].getBackground().equals(Color.RED)) yaniyorMu[i][j] = "Kirmizi";
                    else yaniyorMu[i][j] = "tiklanmadi";
                }
            }
            for (int i = 0; i < 3; i++) {
                if (yaniyorMu[i][0].equals("Mavi") && yaniyorMu[i][1].equals("Mavi") && yaniyorMu[i][2].equals("Mavi")) {
                    kazandi = true;
                    JOptionPane.showMessageDialog(null, "Mavi Kazandı");
                    oyunuYenile();
                } else if (yaniyorMu[i][0].equals("Kirmizi") && yaniyorMu[i][1].equals("Kirmizi") && yaniyorMu[i][2].equals("Kirmizi")) {
                    kazandi = true;
                    JOptionPane.showMessageDialog(null, "Kırmızı Kazandı");
                    oyunuYenile();
                }
            }

            for (int j = 0; j < 3; j++) {
                if (yaniyorMu[0][j].equals("Mavi") && yaniyorMu[1][j].equals("Mavi") && yaniyorMu[2][j].equals("Mavi")) {
                    kazandi = true;
                    JOptionPane.showMessageDialog(null, "Mavi Kazandı");
                    oyunuYenile();
                } else if (yaniyorMu[0][j].equals("Kirmizi") && yaniyorMu[1][j].equals("Kirmizi") && yaniyorMu[2][j].equals("Kirmizi")) {
                    kazandi = true;
                    JOptionPane.showMessageDialog(null, "Kırmızı Kazandı");
                    oyunuYenile();
                }
            }
            if (yaniyorMu[0][0].equals("Mavi") && yaniyorMu[1][1].equals("Mavi") && yaniyorMu[2][2].equals("Mavi") || yaniyorMu[0][2].equals("Mavi") && yaniyorMu[1][1].equals("Mavi") && yaniyorMu[2][0].equals("Mavi")) {
                kazandi = true;
                JOptionPane.showMessageDialog(null, "Mavi Kazandı");
                oyunuYenile();
            }

            if (yaniyorMu[0][0].equals("Kirmizi") && yaniyorMu[1][1].equals("Kirmizi") && yaniyorMu[2][2].equals("Kirmizi") || yaniyorMu[0][2].equals("Kirmizi") && yaniyorMu[1][1].equals("Kirmizi") && yaniyorMu[2][0].equals("Kirmizi")) {
                {
                    kazandi = true;
                    JOptionPane.showMessageDialog(null, "Kırmızı Kazandı");
                    oyunuYenile();
                }
            }

        }
    }
}
