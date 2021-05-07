package arkanoid;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Panel extends JPanel {

    private final int P_WIDTH = 600;
    private final int P_HEIGHT = 500;
    private int szerP = 100;
    private int wysP = 10;
    private int yp = (P_HEIGHT - wysP);
    private int xp = (P_WIDTH - wysP) / 2;
    private int srednica = 20;
    private int xPilki = (P_HEIGHT - srednica) / 2;
    private int yPilki = (P_WIDTH - srednica) / 2;
    private Random generator = new Random();
    private int wiersze = generator.nextInt(5) + 4;
    private int kolumny = generator.nextInt(5) + 4;
    private int szerCegly = 50;
    private int wysCegly = 10;
    private int ceglyX[][] = new int[kolumny][wiersze];
    private int ceglyY[][] = new int[kolumny][wiersze];

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    private void doDrawing(Graphics g) {
        rysujPaletke(g);
        rysujPilke(g);
    }

    private void rysujPaletke(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(xp, yp, szerP, wysP);
        g.setColor(Color.WHITE);
        g.drawRect(xp, yp, szerP, wysP);
    }

    private void rysujPilke(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(xPilki, yPilki, srednica, srednica);
        g.setColor(Color.WHITE);
        g.drawOval(xPilki, yPilki, srednica, srednica);
    }

    public Panel() {
        initPanel();
    }

    private void initPanel() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(P_WIDTH, P_HEIGHT));
    }
}
