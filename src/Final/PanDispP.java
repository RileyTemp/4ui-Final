package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanDispP extends JPanel {

    String backgrounds;
    SprAnvil sprAnvil = new SprAnvil();
    SprAstronaut sprAstronaut = new SprAstronaut();
    SprLeaf sprLeaf = new SprLeaf();
    SprSkydiver sprSkydiver = new SprSkydiver();
    PanSidewalk panSidewalk;
    PanSpace panSpace;
    PanRoad panRoad;
    PanSkatePark panPark;
    PanEarth panEarth;
    PanMars panMars;
    PanJupiter panJupiter;
    String sSprite;
    public Timer timer;

    public void BackgroundChooser(String _s, PanSidewalk _panSidewalk, PanSpace _panSpace, PanRoad _panRoad, PanSkatePark _panPark, PanEarth _panEarth, PanMars _panMars, PanJupiter _panJupiter) {

        setLayout(new BorderLayout());
        backgrounds = _s;
        panSidewalk = _panSidewalk;
        panSpace = _panSpace;
        panRoad = _panRoad;
        panPark = _panPark;
        panEarth = _panEarth;
        panMars = _panMars;
        panJupiter = _panJupiter;

        panSidewalk.setVisible(false);
        panSpace.setVisible(false);
        panRoad.setVisible(false);
        panPark.setVisible(false);
        panEarth.setVisible(false);
        panMars.setVisible(false);
        panJupiter.setVisible(false);
        if (backgrounds.equals("Person")) {
            add(panSidewalk, BorderLayout.CENTER);
            panSidewalk.setVisible(true);
            panSidewalk.requestFocus();
            panSidewalk.Timer(timer);
        } else if (backgrounds.equals("Rocket Ship")) {
            add(panSpace, BorderLayout.CENTER);
            panSpace.setVisible(true);
            panSpace.requestFocus();;
            panSpace.Timer(timer);
        } else if (backgrounds.equals("Car")) {
            add(panRoad, BorderLayout.CENTER);
            panRoad.setVisible(true);
            panRoad.requestFocus();
            panRoad.Timer(timer);
        } else if (backgrounds.equals("Skateboard")) {
            add(panPark, BorderLayout.CENTER);
            panPark.setVisible(true);
            panPark.requestFocus();
            panPark.Timer(timer);
        } else if (backgrounds.equals("Earth")) {
            add(panEarth, BorderLayout.CENTER);
            panEarth.setVisible(true);

        } else if (backgrounds.equals("Mars")) {
            add(panMars, BorderLayout.CENTER);
            panMars.setVisible(true);
        } else if (backgrounds.equals("Jupiter")) {
            add(panJupiter, BorderLayout.CENTER);
            panJupiter.setVisible(true);
        }
    }

    public void SpriteChooser(String _sSprite) {
        sSprite = _sSprite;
        System.out.println(sSprite);
        if (backgrounds.equals("Earth")) {
            panEarth.setSprite(sSprite);
            panEarth.reset();
        } else if (backgrounds.equals("Mars")) {
            panMars.setSprite(sSprite);
            panMars.reset();
        } else if (backgrounds.equals("Jupiter")) {
            panJupiter.setSprite(sSprite);
            panJupiter.reset();
        }
    }

    public PanDispP() {
    }
}
