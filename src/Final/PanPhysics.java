package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanPhysics extends JPanel {
    
    JPanel panMaster;
    CardLayout cardLayout;
    PanDispP panDispP = new PanDispP();
    PanSidewalk panSidewalk = new PanSidewalk();
    PanRoad panRoad = new PanRoad();
    PanSpace panSpace = new PanSpace();
    PanPark panPark = new PanPark();
    PanTabbedP panTabbedP = new PanTabbedP(panDispP, panSidewalk, panRoad, panSpace, panPark);
    
    public PanPhysics(ActionListener buttonListener) {
        
        setLayout(new BorderLayout());
        add(panTabbedP, BorderLayout.WEST);
        add(panDispP, BorderLayout.CENTER);
        //add(panSidewalk, BorderLayout.CENTER);
        //add(panRoad, BorderLayout.CENTER);
        //add(panSpace, BorderLayout.CENTER);
        //add(panPark, BorderLayout.CENTER);
        panSidewalk.setVisible(false);
        panRoad.setVisible(false);
        panSpace.setVisible(false);
        panPark.setVisible(false);
    }
}



/*panMaster = new JPanel(new CardLayout());
        panMaster.add(panFirst);
        panMaster.add(panFunctions);
        panMaster.add(panPhysics);
        getContentPane().add(panMaster);*/