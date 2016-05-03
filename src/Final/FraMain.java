package Final;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FraMain extends JFrame {
    
    JPanel panMaster;
    CardLayout cardLayout;
    
    public FraMain() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener unitChooser = new UnitChooser();
        ActionListener unitChanger = new UnitChanger();
        setLayout(new BorderLayout());
        setSize(810, 510);
        setTitle("Final Project");
        setResizable(true);
        setLocationRelativeTo(null);
        PanUnitChooserP panUnitChooserP = new PanUnitChooserP(unitChanger);
        PanUnitChooserF panUnitChooserF = new PanUnitChooserF(unitChanger);
        PanFirstCard panFirst = new PanFirstCard(unitChooser);
        PanFunctions panFunctions = new PanFunctions(unitChooser, panUnitChooserF);
        PanPhysics panPhysics = new PanPhysics(unitChooser, panUnitChooserP);
        panMaster = new JPanel(new CardLayout());
        panMaster.add(panFirst);
        panMaster.add(panFunctions);
        panMaster.add(panPhysics);
        getContentPane().add(panMaster);
        setVisible(true);
        cardLayout = (CardLayout) panMaster.getLayout();
    }
    
    class UnitChooser implements ActionListener {
        
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
    
    class UnitChanger implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            JButton btn = (JButton) event.getSource();
            String sChoice = btn.getText();
            System.out.println(sChoice);
            if (sChoice.equals("Functions Unit")) {
                cardLayout.last(panMaster);
                cardLayout.previous(panMaster);
            }
            if (sChoice.equals("Physics Unit")) {
                cardLayout.last(panMaster);
            }
        }
    }
}