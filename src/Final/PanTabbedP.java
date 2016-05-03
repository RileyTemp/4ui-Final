package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanTabbedP extends JPanel {

    PanDispP panDispP;

    public PanTabbedP( PanDispP _panDispP) {
        panDispP = _panDispP;
        JTabbedPane tabbedPane = new JTabbedPane();

        JComponent panel1 = makeTextPanel("Choose an object");
        tabbedPane.addTab("Velocity", panel1);
        panel1.setLayout(new GridLayout(3, 1));
        panel1.setPreferredSize(new Dimension(200, 350));
        String[] backgrounds = {"Choose a Unit", "Person", "Skateboard", "Car", "Rocket Ship"};
        final JComboBox cb = new JComboBox(backgrounds);
        //http://stackoverflow.com/questions/14306125/how-to-use-actionlistener-on-a-combobox-to-give-a-variable-a-value
        ActionListener objectChooser = new ObjectChooser() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) cb.getSelectedItem();
            }
        };
        cb.addActionListener(objectChooser);
        panel1.add(cb);
        JComponent panel2 = makeTextPanel("Panel #1");
        tabbedPane.addTab("Gravity", panel2);
        add(tabbedPane);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    class ObjectChooser implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
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