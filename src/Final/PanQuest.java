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

    PanDisp panDisp;
    JLabel lblname;
    private String sLabel;
    JButton btnVel, btnGrav;
    int nCounter = 0;
    String sQuest;

    void UpdateQuestions(String _sNew) {
        //Here I can't put in the classes I want to send it to since it's not
        //the public class
        if (nCounter == 1) { //Removes buttons and labels from physics
            remove(lblname);
            remove(btnVel);
            remove(btnGrav);
        } else if (nCounter == 2) {// Removes buttons and labels from functions
            remove(lblname);
        }
        sLabel = _sNew;
        btnVel = new JButton("Velocity");
        btnGrav = new JButton("Gravity");
        //chooses which buttons to spawn based on which unit is made title
        if (sLabel.equals("Physics")) {
            nCounter = 1;//Changes the counter so when it reads it above it knows that 
            //there are already the buttons and labels there from physics
            setLayout(new GridLayout(3, 1));
            lblname = new JLabel(" Physics Questions");
            add(lblname);
            add(btnVel);
            add(btnGrav);

            class QuestionChooser implements ActionListener {

                public void actionPerformed(ActionEvent event) {
                    JButton btn = (JButton) event.getSource();
                    sQuest = btn.getText();
                    if (sQuest.equals("Velocity")) {
                        //Here I would send it to the class I would have for the velocity demonstration
                    } else if (sQuest.equals("Gravity")) {
                        //Here it would send to a class for gravity
                    }
                }
            }
            ActionListener questionChooser = new QuestionChooser();
            btnVel.addActionListener(questionChooser);
            btnGrav.addActionListener(questionChooser);
        } else if (sLabel.equals("Functions")) {
            nCounter = 2;//Changes the counter so when it reads through it knows
            //that there are buttons and labels there from functions
            setLayout(new GridLayout(1, 1));
            lblname = new JLabel("Math Questions");
            add(lblname);
        }
    }
}