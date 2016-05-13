package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanTabbedP extends JPanel {

    PanDispP panDispP;
    PanPhysics panPhysics;
    PanSidewalk panSidewalk;
    PanRoad panRoad;
    PanSpace panSpace;
    PanPark panPark;

    public PanTabbedP(PanDispP _panDispP, PanSidewalk _panSidewalk, PanRoad _panRoad, PanSpace _panSpace, PanPark _panPark) {
        //sending all the panels to panDispP where it will choose which panel to display
        panDispP = _panDispP;
        panSidewalk = _panSidewalk;
        panRoad = _panRoad;
        panSpace = _panSpace;
        panPark = _panPark;

        JTabbedPane tabbedPane = new JTabbedPane();
        JComponent panel1 = makeTextPanel("Choose an object");
        tabbedPane.addTab("Velocity", panel1);
        panel1.setLayout(new GridLayout(3, 1));
        panel1.setPreferredSize(new Dimension(200, 450));

        String[] backgrounds = {"Choose a Unit", "Person", "Skateboard", "Car", "Rocket Ship"};
        final JComboBox cb = new JComboBox(backgrounds);
        //http://stackoverflow.com/questions/14306125/how-to-use-actionlistener-on-a-combobox-to-give-a-variable-a-value
        ActionListener objectChooser = new ObjectChooser() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) cb.getSelectedItem();
                panDispP.BackgroundChooser(s, panSidewalk, panSpace, panRoad, panPark);
            }
        };
        cb.addActionListener(objectChooser);
        panel1.add(cb);
        JButton btnUp = new JButton("Up");
        JButton btnDown = new JButton("Down");
        JButton btnLeft = new JButton("Left");
        JButton btnRight = new JButton("Right");
        panel1.add(btnUp);
        panel1.add(btnDown);
        panel1.add(btnLeft);
        panel1.add(btnRight);
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
}