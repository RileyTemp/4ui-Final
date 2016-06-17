package Final;

import java.awt.*;
import javax.swing.*;

public class PanLinear extends JPanel {

    public PanLinear() {
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("linear.png"));
        add(background);
    }
}