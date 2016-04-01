package Scratches;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {
    
    
    PanChooser panChooser = new PanChooser();

    public PanMain() {
        setLayout(new BorderLayout());
        add(panChooser, BorderLayout.SOUTH);
    }
}
