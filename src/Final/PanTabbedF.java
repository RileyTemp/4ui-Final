package Final;

import javax.swing.*;
import java.awt.*;

public class PanTabbedF extends JPanel {

    public PanTabbedF() {
        JTabbedPane tabbedPane = new JTabbedPane();

        JComponent panel1 = makeTextPanel("Velocity");
        tabbedPane.addTab("Graphing Calculator", panel1);
        panel1.setPreferredSize(new Dimension(200, 350));
        add(tabbedPane);
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

    private static void createAndShowGUI() {
    }
}