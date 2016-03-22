package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel {

    PanOut panOut;
    private JLabel lblName;
    private String sLabel;
    private String sColour;
    private int nCount;
    Timer timer;

    public PanDisp(PanOut _panOut) {
        panOut = _panOut;
        timer = new Timer(1000, updateTask);
        // this Panel will contain all of the output, therefore called PanDisp for display
        // It will be in the CENTRE of PanMain
        lblName = new JLabel(" Choose a unit");
        add(lblName); //add it to the Frame
        nCount = 0;
        timer.start();
    }

    void UpdateLabel(String _sNew) {
        sLabel = _sNew;
        lblName.setText(sLabel);
    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount++;
            panOut.UpdateLabel(nCount);
            //System.out.println(nCount);
        }
    };
}