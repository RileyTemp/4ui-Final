package Scratches;

import javax.swing.JFrame;

public class FraMain extends JFrame {

    public FraMain() {
        PanMain panMain = new PanMain();
        add(new PanMain());
        setTitle("Scratches");
        setSize(600, 600);
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
