import javax.swing.*;
import java.awt.*;

public class CosinusGrafigi extends JPanel {
    //Cosinus 45 (değiştirilebilir) grafiğini çizen uygulama
    private double aci; // Girilen açı

    public CosinusGrafigi(double aci) {
        this.aci = aci;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.BLACK);
        g.drawLine(0, height / 2, width, height / 2); // X ekseni
        g.setColor(Color.RED);
        int x1 = 0;
        int y1 = height / 2;

        for (int x2 = 1; x2 <= width; x2++) {
            double radians = Math.toRadians(x2 * aci);
            int y2 = (int) (height / 2 - Math.cos(radians) * height / 4); // Y ekseni
            g.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }

    public static void main(String[] args) {
        double aci = 0.45;
        CosinusGrafigi graph = new CosinusGrafigi(aci);
        JFrame frame = new JFrame();
        frame.setTitle("Cosinus Grafiği");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(graph);
        frame.setVisible(true);
    }
}
