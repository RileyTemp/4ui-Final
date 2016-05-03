package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanDispP extends JPanel {

    String backgrounds;
    int nCounter;

    void background(String _s) {
        backgrounds = _s;
        System.out.println(backgrounds);
    }

    public PanDispP() {
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("sidewalk.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
    }
}

    /*setLayout(new BorderLayout());
     JLabel background = new JLabel(new ImageIcon("FHCI.jpg"));
     add(background);
     background.setLayout(new FlowLayout());*/