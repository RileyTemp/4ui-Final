/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import javax.swing.*;

public class PanOut extends JPanel {

    int nCount;
    String sCount;
    private JLabel lblCount;

    public PanOut() {
        lblCount = new JLabel("0");
        add(lblCount);
    }

    void UpdateLabel(int _nCount) {
        nCount = _nCount;
        sCount = Integer.toString(nCount);
        lblCount.setText(sCount);
    }
}