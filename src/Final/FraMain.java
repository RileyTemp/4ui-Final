package Final;

import javax.swing.JFrame;

public class FraMain extends JFrame {

    public FraMain() {
        PanMain panMain = new PanMain();
        add(new PanMain());
        setTitle("Project");
        setSize(800, 800);
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}