import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

class Panelim extends JPanel implements MouseMotionListener {
    //fareyi takip eden bir top çizin fareye basarak hareket ettilirse topun rengi değişsin!
    int topXkonum, topYkonum;
    boolean renk = true;
    Panelim() {
        BufferedImage cursorImage = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Cursor invisibleCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(0, 0), "InvisibleCursor");
        this.setCursor(invisibleCursor);
        this.setBackground(Color.orange);
        this.setPreferredSize(new Dimension(500, 500));
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        renk = false;
        topXkonum = e.getX() - 15;
        topYkonum = e.getY() - 15;
        repaint();
        e.consume();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        renk = true;
        topXkonum = e.getX() - 15;
        topYkonum = e.getY() - 15;
        repaint();
        e.consume();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(topXkonum, topYkonum, 30, 30);
        if (renk) g.setColor(Color.red);
        else g.setColor(Color.blue);
        g.fillOval(topXkonum, topYkonum, 30, 30);
    }
}

public class FareyiTakipEttir extends JFrame {
    public FareyiTakipEttir() {
        this.add(new Panelim());
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FareyiTakipEttir();
    }
}
