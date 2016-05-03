package Final;

import javax.swing.*;
import java.awt.event.*;

public class PanUnitChooserP extends JPanel {
    
    JButton btnPhysics, btnFunctions;
    JLabel lblname;
    
    public PanUnitChooserP(ActionListener unitChanger) {
        lblname = new JLabel("Choose a unit");
        btnPhysics = new JButton("Physics Unit");
        btnFunctions = new JButton("Functions Unit");
        add(lblname);
        add(btnPhysics);
        add(btnFunctions);
        btnPhysics.addActionListener(unitChanger);
        btnFunctions.addActionListener(unitChanger);
    }
}
