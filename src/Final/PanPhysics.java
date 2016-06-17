package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanPhysics extends JPanel {

    PanDispP panDispP = new PanDispP();
    PanSidewalk panSidewalk = new PanSidewalk();
    PanRoad panRoad = new PanRoad();
    PanSpace panSpace = new PanSpace();
    PanSkatePark panPark = new PanSkatePark();
    PanEarth panEarth = new PanEarth();
    PanMars panMars = new PanMars();
    PanJupiter panJupiter = new PanJupiter();
    PanButtonTimer panButtonTimer = new PanButtonTimer(panEarth, panMars, panJupiter);
    PanTabbedP panTabbedP = new PanTabbedP(panDispP, panSidewalk, panRoad, panSpace, panPark, panEarth, panMars, panJupiter, panButtonTimer);

    public PanPhysics(ActionListener buttonListener) {

        setLayout(new BorderLayout());
        add(panTabbedP, BorderLayout.WEST);
        add(panDispP, BorderLayout.CENTER);
    }
}



/*panMaster = new JPanel(new CardLayout());
        panMaster.add(panFirst);
        panMaster.add(panFunctions);
        panMaster.add(panPhysics);
        getContentPane().add(panMaster);*/