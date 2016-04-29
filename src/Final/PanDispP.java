package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanDispP extends JPanel {

    JLabel lblname;

    void background(String _s) {
        String s = _s;
        System.out.println(s);
        if (s.equals("Person")) {
            setLayout(new BorderLayout());
            JLabel background = new JLabel(new ImageIcon("sidewalk.jpg"));
            add(background);
            background.setLayout(new FlowLayout());
            lblname = new JLabel("thing");
            background.add(lblname);
        } else if (s.equals("Car")) {
        } else if (s.equals("Skateboard")) {
        } else if (s.equals("Spaceship")) {
        }
    }
}
/*setLayout(new BorderLayout());
 JLabel background = new JLabel(new ImageIcon("FHCI.jpg"));
 add(background);
 background.setLayout(new FlowLayout());*/