package Final;

import javax.swing.*;
import java.awt.*;

public class PanDispF extends JPanel {

    String sGraph;
    PanLinear panLinear;
    PanQuadratic panQuadratic;
    PanExponential panParabola;

    public void Chooser(String _Choice, PanLinear _panLinear, PanQuadratic _panQuadratic, PanExponential _panParabola) {
        sGraph = _Choice;
        System.out.println(sGraph);
        panLinear = _panLinear;
        panQuadratic = _panQuadratic;
        panParabola = _panParabola;
        panLinear.setVisible(false);
        panQuadratic.setVisible(false);
        panParabola.setVisible(false);
        if (sGraph.equals("Linear")) {
            add(panLinear, BorderLayout.CENTER);
            panLinear.setVisible(true);            
        } else if (sGraph.equals("Quadratic")) {
            add(panQuadratic, BorderLayout.CENTER);
            panQuadratic.setVisible(true);
        } else if (sGraph.equals("Exponential")) {
            add(panParabola, BorderLayout.CENTER);
            panParabola.setVisible(true);
        }
    }
}
