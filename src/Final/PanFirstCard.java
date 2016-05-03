
package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanFirstCard extends JPanel {    

    JButton btnPhysics, btnFunctions;
    JLabel lblname;

    public PanFirstCard(ActionListener unitChooser) {
        lblname = new JLabel("Choose a unit");
        btnPhysics = new JButton("Physics Unit");
        btnFunctions = new JButton("Functions Unit");
        add(lblname);
        add(btnPhysics);
        add(btnFunctions);
        btnPhysics.addActionListener(unitChooser);
        btnFunctions.addActionListener(unitChooser);
    }
}