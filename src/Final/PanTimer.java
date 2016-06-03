package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanTimer {

    String sDirection, sSame;
    Timer timer;
    int nCount;

    public void start(String _s) {

        sDirection = _s;
        if (sDirection.equals(sSame)) {
        } else {
            timer = new Timer(500, updateTask);
            nCount = 0;
            timer.start();
            sSame = sDirection;
        }
    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount++;
        }
    };
}