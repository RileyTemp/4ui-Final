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
    PanSkatePark panPark;
    PanEarth panEarth;
    PanMars panMars;
    PanJupiter panJupiter;
    PanButtonTimer panButtonTimer;
    ActionListener faller = new Faller();
    String s, g;

    public PanTabbedP(PanDispP _panDispP, PanSidewalk _panSidewalk, PanRoad _panRoad, PanSpace _panSpace, PanSkatePark _panPark, PanEarth _panEarth, PanMars _panMars, PanJupiter _panJupiter, PanButtonTimer _panButtonTimer) {

        //sending all the panels to panDispP where it will choose which panel to display
        panDispP = _panDispP;
        panSidewalk = _panSidewalk;
        panRoad = _panRoad;
        panSpace = _panSpace;
        panPark = _panPark;
        panEarth = _panEarth;
        panMars = _panMars;
        panJupiter = _panJupiter;
        panButtonTimer = _panButtonTimer;

        JTabbedPane tabbedPane = new JTabbedPane();
        JComponent panel1 = makeTextPanel("Choose an sprite");
        tabbedPane.addTab("Velocity", panel1);
        panel1.setLayout(new GridLayout(3, 1));
        panel1.setPreferredSize(new Dimension(200, 450));
        String[] backgrounds = {"Sprites", "Person", "Skateboard", "Car", "Rocket Ship"};
        final JComboBox cb = new JComboBox(backgrounds);
        //http://stackoverflow.com/questions/14306125/how-to-use-actionlistener-on-a-combobox-to-give-a-variable-a-value
        ActionListener objectChooser = new ObjectChooser() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = (String) cb.getSelectedItem();
                panDispP.BackgroundChooser(s, panSidewalk, panSpace, panRoad, panPark, panEarth, panMars, panJupiter);
            }
        };
        cb.addActionListener(objectChooser);
        panel1.add(cb);
        JComponent panel2 = makeTextPanel("Choose a Planet");
        tabbedPane.addTab("Gravity", panel2);
        panel2.setLayout(new GridLayout(3, 1));
        String[] gravities = {"Choose a Planet", "Earth", "Mars", "Jupiter"};
        final JComboBox cd = new JComboBox(gravities);
        ActionListener gravityChooser = new GravityChooser() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = (String) cd.getSelectedItem();
                panDispP.BackgroundChooser(s, panSidewalk, panSpace, panRoad, panPark, panEarth, panMars, panJupiter);
                panButtonTimer.Gravity(s);
            }
        };
        cd.addActionListener(gravityChooser);
        panel2.add(cd);
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        panel2.add(btnStart);
        panel2.add(btnStop);
        btnStart.addActionListener(faller);
        btnStop.addActionListener(faller);
        add(tabbedPane);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    class ObjectChooser implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    class GravityChooser implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    class Faller implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            String b = btn.getText();
            if (b.equals("Start")) {
                panButtonTimer.start(b);
            }else if (b.equals("Stop")){
                panButtonTimer.stop(s);
            }
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

    /*class Mover implements ActionListener {

     public void actionPerformed(ActionEvent e) {
     System.out.println(s);
     String q = e.getActionCommand();
     if (s.equals("Person")) {
     panSidewalk.requestFocus();
     } else if (s.equals("Car")) {
     panRoad.requestFocus();
     } else if (s.equals("Skateboard")) {
     panPark.requestFocus();
     } else if (s.equals("Rocket Ship")) {
     panSpace.requestFocus();
     }

     }
     }*/
}