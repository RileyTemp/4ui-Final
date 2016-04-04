package Scratches;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    Pan1 pan1 = new Pan1();
    Pan2 pan2 = new Pan2();
    PanChooser panChooser = new PanChooser(pan1, pan2);

    public PanMain() {
        setLayout(new BorderLayout());
        add(panChooser, BorderLayout.SOUTH);
    }
}
