package Scratches;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanChooser extends JPanel {

    String sChoice;
    Pan1 pan1;
    Pan2 pan2;

    public PanChooser(Pan1 _pan1, Pan2 _pan2) {
        pan1 = _pan1;
        pan2 = _pan2;
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        add(btn1);
        add(btn2);

        class PanelChanger implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton btn = (JButton) event.getSource();
                sChoice = btn.getText();
                if (sChoice.equals("Button 1")) {
                    pan1.PanelChooser(sChoice);
                } else if (sChoice.equals("Button 2")) {
                    pan2.PanelChooser(sChoice);
                }
            }
        }
        ActionListener panChanger = new PanelChanger();
        btn1.addActionListener(panChanger);
        btn2.addActionListener(panChanger);
    }
}