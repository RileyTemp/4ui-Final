/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanQuest extends JPanel {

    JLabel lblname;
    private String sLabel;
    JButton btnVel, btnGrav;
    int nCounter = 0;

    public PanQuest() {
    }

    void UpdateQuestions(String _sNew) {
        if (nCounter == 1) {
            remove(lblname);
            remove(btnVel);
            remove(btnGrav);
        } else if (nCounter == 2) {
            remove(lblname);
        }
        sLabel = _sNew;

        btnVel = new JButton("Velocity");
        btnGrav = new JButton("Gravity");
        //chooses which buttons to spawn based on which unit is made title
        if (sLabel.equals("Physics")) {
            nCounter = 1;
            setLayout(new GridLayout(3, 1));
            lblname = new JLabel(" Physics Questions");
            add(lblname);
            add(btnVel);
            add(btnGrav);
        } else if (sLabel.equals("Functions")) {
            nCounter = 2;
            setLayout(new GridLayout(1, 1));
            lblname = new JLabel("Math Questions");
            add(lblname);
        }
    }
}
