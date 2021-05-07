package arkanoid;

import javax.swing.*;
import java.awt.*;

public class Arkanoid extends JFrame {

    public Arkanoid() {
        add(new Panel());
        setResizable(false);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Arkanoid - Matplaneta");
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Arkanoid();
            ex.setVisible(true);
        });

    }
}
