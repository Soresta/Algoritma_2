import javax.swing.*;
import java.awt.*;

public class TekerlekAnimasyonu extends JPanel {
    //soru : dönen bir tekerler animasyonu yapınız(java swing).
    private int x = 0;
    TekerlekAnimasyonu() {
        this.setPreferredSize(new Dimension(500, 500));
        new Timer(10, (e) -> {
            x += 1;
            repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(130, 150, 250, 250);
        g.fillArc(130, 150, 250, 250, x, 15);
        g.fillArc(130, 150, 250, 250, 45 + x, 15);
        g.fillArc(130, 150, 250, 250, 90 + x, 15);
        g.fillArc(130, 150, 250, 250, 135 + x, 15);
        g.fillArc(130, 150, 250, 250, 180 + x, 15);
        g.fillArc(130, 150, 250, 250, 225 + x, 15);
        g.fillArc(130, 150, 250, 250, 270 + x, 15);
        g.fillArc(130, 150, 250, 250, 315 + x, 15);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tekerlek Animasyonu");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new TekerlekAnimasyonu());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
