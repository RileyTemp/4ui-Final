package Final;

import javax.swing.*;
import java.awt.event.*;

public class PanButtonTimer {

    String sChoice;
    Timer timer;
    int nCount;
    PanEarth panEarth;
    PanMars panMars;
    PanJupiter panJupiter;

    public PanButtonTimer(PanEarth _panEarth, PanMars _panMars, PanJupiter _panJupiter) {
        panEarth = _panEarth;
        panMars = _panMars;
        panJupiter = _panJupiter;
    }

    public void Gravity(String _s) {
        sChoice = _s;
        System.out.println(sChoice);
    }

    public void start(String _s) {
        timer = new Timer(80, updateTask);
        nCount = 0;
        timer.start();

    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount++;
            System.out.println(nCount);
            if (nCount >= 0) {
                if (sChoice.equals("Earth")) {
                    panEarth.moveSprite();
                    if (panEarth.y == 540) {
                        timer.stop();
                    }
                } else if (sChoice.equals("Mars")) {
                    panMars.moveSprite();
                    if (panMars.y == 540) {
                        timer.stop();
                    }
                } else if (sChoice.equals("Jupiter")) {
                    panJupiter.moveSprite();
                    if (panJupiter.y == 585) {
                        timer.stop();
                    }
                }
            }
        }
    };

    public void stop(String _s) {
        timer.stop();
    }
}
