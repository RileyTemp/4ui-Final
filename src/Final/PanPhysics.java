package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanPhysics extends JPanel {

    JPanel panMaster;
    CardLayout cardLayout;
    PanUnitChooserP panUnitChooser;
    PanDispP panDispP = new PanDispP();
    PanTabbedP panTabbedP = new PanTabbedP(panDispP);

    public PanPhysics(ActionListener buttonListener, PanUnitChooserP _panUnitChooser) {

        panUnitChooser = _panUnitChooser;
        setLayout(new BorderLayout());
        add(panUnitChooser, BorderLayout.NORTH);
        add(panTabbedP, BorderLayout.WEST);
    }
}
/*panMaster = new JPanel(new CardLayout());
        panMaster.add(panFirst);
        panMaster.add(panFunctions);
        panMaster.add(panPhysics);
        getContentPane().add(panMaster);*/