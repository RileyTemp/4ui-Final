package Scratches;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanChooser extends JPanel {

    String sChoice;

    public PanChooser() {
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        add(btn1);
        add(btn2);

        class PanelChanger implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton btn = (JButton) event.getSource();
                sChoice = btn.getText();
                System.out.println(sChoice);
            }
        }
        ActionListener panChanger = new PanelChanger();
        btn1.addActionListener(panChanger);
        btn2.addActionListener(panChanger);
    }
}