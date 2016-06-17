package Final;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PanJupiter extends JPanel implements ActionListener {

    static boolean drawn = false;
    SprLeaf sprLeaf = new SprLeaf();
    SprAstronaut sprAstronaut = new SprAstronaut();
    SprAnvil sprAnvil = new SprAnvil();
    SprBlank sprBlank = new SprBlank();
    Timer timer;
    Image background;
    int y;
    int nSpeed, nGrav = 5;
    String sSprite = "Blank";

    public PanJupiter() {

        setFocusable(true);
        ImageIcon i1 = new ImageIcon("jupiter.jpg");
        background = i1.getImage();
        timer = new Timer(1, this);
        timer.start();

    }

    public void actionPerformed(ActionEvent arg0) {

        //sprLeaf.move();
        repaint();
    }

    void setSprite(String _sSprite) {
        sSprite = _sSprite;
    }

    public void reset() {
        if (sSprite.equals("Anvil")) {
            sprAnvil.reset();
        } else if (sSprite.equals("Person")) {
            sprAstronaut.reset();
        } else if (sSprite.equals("Leaf")) {
            sprLeaf.reset();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        if (sSprite.equals("Blank")) {
            g2d.drawImage(sprBlank.getImage(), sprBlank.getX(), sprBlank.getY(), null);
        } else if (sSprite.equals("Anvil")) {
            g2d.drawImage(sprAnvil.getImage(), sprAnvil.getX(), sprAnvil.getY(), null);
        } else if (sSprite.equals("Person")) {
            g2d.drawImage(sprAstronaut.getImage(), sprAstronaut.getX(), sprAstronaut.getY(), null);
        } else if (sSprite.equals("Leaf")) {
            g2d.drawImage(sprLeaf.getImage(), sprLeaf.getX(), sprLeaf.getY(), null);
        } else {
        }
    }

    public void moveSprite() {
        if (sSprite.equals("Anvil")) {
            nSpeed = nGrav * 5;
            sprAnvil.falling(nSpeed);
        } else if (sSprite.equals("Person")) {
            nSpeed = nGrav * 3;
            sprAstronaut.falling(nSpeed);
        } else if (sSprite.equals("Leaf")) {
            nSpeed = nGrav;
            sprLeaf.falling(nSpeed);
        }
    }

    void display(int n) {
    }
}