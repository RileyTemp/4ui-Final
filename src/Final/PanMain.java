package Final;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanOut panOut = new PanOut();
    PanDisp panDisp = new PanDisp(panOut);
    PanVel panVel = new PanVel();
    PanQuest panQuest = new PanQuest();
    PanUnit panUnit = new PanUnit(panDisp, panQuest);

    public PanMain() {
        setLayout(new BorderLayout());
        add(panOut, BorderLayout.EAST);
        add(panDisp, BorderLayout.NORTH);
        add(panUnit, BorderLayout.SOUTH);
        add(panQuest, BorderLayout.WEST);
        add(panVel, BorderLayout.CENTER);
    }
}
