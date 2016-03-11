/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import javax.swing.*;
import java.awt.*;

public class PanQuest extends JPanel {

    JLabel lblname;
    private String sLabel;
    JButton btnVel, btnGrav;

    public PanQuest() {
    }

    void UpdateQuestions(String _sNew) {
        sLabel = _sNew;
        btnVel = new JButton("Velocity");
        btnGrav = new JButton("Gravity");
        //chooses which buttons to spawn based on which unit is made title
        if (sLabel.equals("Physics")) {
            setLayout(new GridLayout(3, 1));
            lblname = new JLabel(" Physics Questions");
            add(lblname);
            add(btnVel);
            add(btnGrav);
        } else if (sLabel.equals("Functions")) {
            setLayout(new GridLayout(1, 1));
            lblname = new JLabel("Math Questions");
        }
        
    }   
}