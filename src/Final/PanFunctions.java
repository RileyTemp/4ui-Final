package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanFunctions extends JPanel {

    PanDispF panDispF = new PanDispF();
    PanLinear panLinear = new PanLinear();
    PanQuadratic panQuadratic = new PanQuadratic();
    PanExponential panParabola = new PanExponential();
    PanTabbedF panTabbedF = new PanTabbedF(panDispF, panLinear, panQuadratic, panParabola);

    public PanFunctions(ActionListener buttonListener) {

        setLayout(new BorderLayout());
        add(panTabbedF, BorderLayout.WEST);
        add(panDispF, BorderLayout.CENTER);
    }
}
