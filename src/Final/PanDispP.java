package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanDispP extends JPanel {

    String backgrounds;
    JPanel panMaster;
    CardLayout cardLayout;
    PanSidewalk panSidewalk;
    PanSpace panSpace;
    PanRoad panRoad;
    PanSkatePark panPark;
    public Timer timer;

    void BackgroundChooser(String _s, PanSidewalk _panSidewalk, PanSpace _panSpace, PanRoad _panRoad, PanSkatePark _panPark) {
        setLayout(new BorderLayout());
        backgrounds = _s;
        panSidewalk = _panSidewalk;
        panSpace = _panSpace;
        panRoad = _panRoad;
        panPark = _panPark;
        panSidewalk.setVisible(false);
        panSpace.setVisible(false);
        panRoad.setVisible(false);
        panPark.setVisible(false);
        if (backgrounds.equals("Person")) {
            add(panSidewalk, BorderLayout.CENTER);
            panSidewalk.setVisible(true);
            panSidewalk.requestFocus();
            panSidewalk.Timer(timer);
        } else if (backgrounds.equals("Rocket Ship")) {
            add(panSpace, BorderLayout.CENTER);
            panSpace.setVisible(true);
            panSpace.requestFocus();;
            panSpace.Timer(timer);
        } else if (backgrounds.equals("Car")) {
            add(panRoad, BorderLayout.CENTER);
            panRoad.setVisible(true);
            panRoad.requestFocus();
            panRoad.Timer(timer);
        } else if (backgrounds.equals("Skateboard")) {
            add(panPark, BorderLayout.CENTER);
            panPark.setVisible(true);
            panPark.requestFocus();
            panPark.Timer(timer);
        }
    }

    public PanDispP() {
    }
}

    /*setLayout(new BorderLayout());
     JLabel background = new JLabel(new ImageIcon("FHCI.jpg"));
     add(background);
     background.setLayout(new FlowLayout());*/