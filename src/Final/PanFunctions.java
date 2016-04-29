
package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanFunctions extends JPanel {

    JLabel lblname;
    PanTitleF panTitleF;
    PanTabbedF panTabbedF = new PanTabbedF();

    public PanFunctions(ActionListener buttonListener, PanTitleF _panTitleF) {
        panTitleF = _panTitleF;
        setLayout(new BorderLayout());
        add(panTitleF, BorderLayout.NORTH);
        add(panTabbedF, BorderLayout.WEST);
    }
}
