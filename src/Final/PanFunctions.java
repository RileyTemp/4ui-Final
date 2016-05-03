package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanFunctions extends JPanel {

    //PanUnitChooser panUnitChooser;
    PanUnitChooserF panUnitChooser;
    PanTabbedF panTabbedF = new PanTabbedF();

    public PanFunctions(ActionListener buttonListener, PanUnitChooserF _panUnitChooser) {
        panUnitChooser = _panUnitChooser;
        setLayout(new BorderLayout());
        System.out.println("hahaha");
        add(panUnitChooser, BorderLayout.NORTH);
        add(panTabbedF, BorderLayout.WEST);
    }
}
