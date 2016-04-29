
package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanFirst extends JPanel {
    //JButton btnNext, btnPrev;

    JButton btnPhysics, btnFunctions;
    JLabel lblname;

    public PanFirst(ActionListener buttonListener) {
        lblname = new JLabel("Choose a unit");
        btnPhysics = new JButton("Physics Unit");
        btnFunctions = new JButton("Functions Unit");
        add(lblname);
        add(btnPhysics);
        add(btnFunctions);
        btnPhysics.addActionListener(buttonListener);
        btnFunctions.addActionListener(buttonListener);
    }
}
