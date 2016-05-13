package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanFunctions extends JPanel {


    PanTabbedF panTabbedF = new PanTabbedF();

    public PanFunctions(ActionListener buttonListener) {

        setLayout(new BorderLayout());
        add(panTabbedF, BorderLayout.WEST);
    }
}
