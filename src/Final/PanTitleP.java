package Final;

import java.awt.event.ActionListener;
import javax.swing.*;

public class PanTitleP extends JPanel {
    
    JLabel title;
    JButton btnFunctions;

    public PanTitleP(ActionListener ButtonChanger) {
        title = new JLabel("Welcome to the Physics unit");
        btnFunctions = new JButton("Functions");
        add(title);
        add(btnFunctions);
        btnFunctions.addActionListener(ButtonChanger);
    }
}
