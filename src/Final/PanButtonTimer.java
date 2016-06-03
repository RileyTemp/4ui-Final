package Final;

import javax.swing.*;
import java.awt.event.*;

public class PanButtonTimer {

    String s;
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
        s = _s;
        System.out.println(s);
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
                if (s.equals("Earth")) {
                    panEarth.moveSprite();
                } else if (s.equals("Mars")) {
                    panMars.moveSprite();
                } else if (s.equals("Jupiter")) {
                    panJupiter.moveSprite();
                }
            }
        }
    };

    public void stop(String _s) {
        timer.stop();
    }
}
