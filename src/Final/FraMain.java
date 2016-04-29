package Final;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FraMain extends JFrame {

    JPanel panMaster;
    CardLayout cardLayout;

    public FraMain() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener buttonListener = new ButtonListener();
        ActionListener buttonChanger = new ButtonChanger();
        setLayout(new BorderLayout());
        setSize(810, 510);
        setTitle("Final Project");
        setResizable(true);
        setLocationRelativeTo(null);
        PanTitleF panTitleF = new PanTitleF(buttonChanger);
        PanTitleP panTitleP = new PanTitleP(buttonChanger);
        PanFirst panFirst = new PanFirst(buttonListener);
        PanFunctions panFunctions = new PanFunctions(buttonListener, panTitleF);
        PanPhysics panPhysics = new PanPhysics(buttonListener, panTitleP);
        panMaster = new JPanel(new CardLayout());
        panMaster.add(panFirst);
        panMaster.add(panFunctions);
        panMaster.add(panPhysics);
        getContentPane().add(panMaster);
        setVisible(true);
        cardLayout = (CardLayout) panMaster.getLayout();
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            JButton btn = (JButton) event.getSource();
            String sAction;
            sAction = btn.getText();
            System.out.println(sAction);
            if (sAction.equals("Functions Unit")) {
                cardLayout.next(panMaster);
            }
            if (sAction.equals("Physics Unit")) {
                cardLayout.last(panMaster);
            }
        }
    }

    class ButtonChanger implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JButton btn = (JButton) event.getSource();
            String sChoice = btn.getText();
            System.out.println(sChoice);
            if (sChoice.equals("Functions")) {
                cardLayout.previous(panMaster);
            }
            if (sChoice.equals("Physics")) {
                cardLayout.next(panMaster);
            }
        }
    }
}