import javax.swing.*;
import java.awt.*;

public class Main extends JPanel implements Runnable {
    /*
     • Bir çalışma örneği: Bu çalışmada rastgele kareler rastgele seçilen renklerle ile ortaya çıkıyor zamanlar
     thread ve Gui konularındaki konseptler kullanılarak yapılmıştır.
     */
    int randomSecimX = 0;
    int randomSecimY = 0;
    Rectangle[][] rectangles = new Rectangle[19][18];
    Color[] renkler = {Color.black, Color.blue, Color.yellow, Color.cyan, Color.green, Color.red, Color.white, Color.MAGENTA};
    boolean cond = true;
    int randomSayi;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Labirent");
        Main main = new Main();
        frame.add(main);
        frame.setSize(600, 590);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        Thread thread = new Thread(main);
        thread.start();
    }

    public void paint(Graphics g) {
        super.paintComponents(g);
        if (cond) draw(g);
        g.setColor(renkler[randomSayi]);
        g.fillRect(rectangles[randomSecimX][randomSecimY].x, rectangles[randomSecimX][randomSecimY].y, 25, 25);
    }

    public void draw(Graphics g) {
        int sayacX = 0;
        for (int i = 10; i < getWidth() - 10; i += 30) {
            int sayacY = 0;
            for (int j = 10; j < getHeight() - 20; j += 30) {
                Rectangle kare = new Rectangle(i, j, 25, 25);
                rectangles[sayacX][sayacY] = kare;
                sayacY++;
            }
            sayacX++;
        }
        cond = false;
    }

    @Override
    public void run() {
        while (true) {
            randomSecimX = (int) (Math.random() * 19);
            randomSecimY = (int) (Math.random() * 18);
            randomSayi = (int) (Math.random() * 8);
            try {
                Thread.sleep(50);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            repaint();
        }
    }
}
