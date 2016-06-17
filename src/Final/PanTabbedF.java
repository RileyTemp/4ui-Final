package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanTabbedF extends JPanel {

    JButton btnLinear, btnQuadratic, btnParabola;
    ActionListener graph = new Graph();
    PanDispF panDispF;
    PanLinear panLinear;
    PanQuadratic panQuadratic;
    PanExponential panParabola;

    public PanTabbedF(PanDispF _panDispF, PanLinear _panLinear, PanQuadratic _panQuadratic, PanExponential _panParabola) {
        panDispF = _panDispF;
        panLinear = _panLinear;
        panQuadratic = _panQuadratic;
        panParabola = _panParabola;
        JTabbedPane tabbedPane = new JTabbedPane();

        JComponent panel1 = makeTextPanel("Functions Stuff");
        tabbedPane.addTab("Graphing Calculator", panel1);
        panel1.setPreferredSize(new Dimension(200, 350));
        add(tabbedPane);
        btnLinear = new JButton("Linear");
        btnQuadratic = new JButton("Quadratic");
        btnParabola = new JButton("Exponential");
        panel1.add(btnLinear);
        panel1.add(btnQuadratic);
        panel1.add(btnParabola);
        panel1.setLayout(new GridLayout(2, 4));
        btnLinear.addActionListener(graph);
        btnQuadratic.addActionListener(graph);
        btnParabola.addActionListener(graph);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    class Graph implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String sChoice = btn.getText();
            panDispF.Chooser(sChoice, panLinear, panQuadratic, panParabola);
        }
    }
}