package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanPhysics extends JPanel {

    PanTitleP panTitle;
    PanDispP panDispP = new PanDispP();
    PanTabbedP panTabbedP = new PanTabbedP(panDispP);

    public PanPhysics(ActionListener buttonListener, PanTitleP _panTitle) {

        panTitle = _panTitle;
        setLayout(new BorderLayout());
        add(panDispP, BorderLayout.CENTER);
        add(panTitle, BorderLayout.NORTH);
        add(panTabbedP, BorderLayout.WEST);
    }
}
