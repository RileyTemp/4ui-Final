/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanUnit extends JPanel {

    String sName;
    PanDisp panDisp;
    PanQuest panQuest;

    public PanUnit(PanDisp _panDisp, PanQuest _panQuest) {
        panDisp = _panDisp;
        panQuest = _panQuest;
        JButton btnPhysics = new JButton("Physics");
        JButton btnFunctions = new JButton("Functions");
        add(btnPhysics);
        add(btnFunctions);

        class LabelChangeListener implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton btn = (JButton) event.getSource();
                sName = btn.getText(); // gets the text value of the button
                if (sName.equals("Physics")) {
                    panDisp.UpdateLabel(sName);// Sends the new label name to PanDisp
                    panQuest.Physics(sName);// Sends the name of which unit the user chose
                } else if (sName.equals("Functions")) {
                    panDisp.UpdateLabel(sName);
                    panQuest.Functions(sName);
                }
            }
        }
        ActionListener labelChangeListener = new LabelChangeListener();

        btnPhysics.addActionListener(labelChangeListener);

        btnFunctions.addActionListener(labelChangeListener);
    }
}