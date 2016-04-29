package Final;

import java.awt.event.ActionListener;
import javax.swing.*;

public class PanTitleF extends JPanel {
    
    JLabel title;
    JButton btnPhysics;

    public PanTitleF(ActionListener ButtonChanger) {
        title = new JLabel("Welcome to the Advanced Functions Unit");
        btnPhysics = new JButton("Physics");
        add(title);
        add(btnPhysics);
        btnPhysics.addActionListener(ButtonChanger);
    }
}
