package Final;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class PanUnitChooser extends JPanel {

    JButton btnPhysics, btnFunctions;
    JLabel lblname;

    public PanUnitChooser(ActionListener unitChanger) {
        lblname = new JLabel("Choose a unit");
        btnPhysics = new JButton("Physics Unit");
        btnFunctions = new JButton("Functions Unit");
        btnFunctions.setBackground(Color.WHITE);
        btnPhysics.setBackground(Color.WHITE);
        add(lblname);
        add(btnPhysics);
        add(btnFunctions);
        btnPhysics.addActionListener(unitChanger);
        btnFunctions.addActionListener(unitChanger);
    }
}
