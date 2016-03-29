package Final;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanOut panOut = new PanOut();
    PanDisp panDisp = new PanDisp(panOut);
    PanQuest panQuest = new PanQuest();
    PanUnit panUnit = new PanUnit(panDisp, panQuest);
    private PanOut PanOut;

    public PanMain() {
        setLayout(new BorderLayout());
        add(panOut, BorderLayout.EAST);
        add(panDisp, BorderLayout.NORTH);
        add(panUnit, BorderLayout.SOUTH);
        add(panQuest, BorderLayout.WEST);
    }
}
