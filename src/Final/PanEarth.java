package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanEarth extends JPanel implements ActionListener {

    static boolean drawn = false;
    SprAnvil sprAnvil = new SprAnvil();
    SprSkydiver sprSkydiver = new SprSkydiver();
    SprLeaf sprLeaf = new SprLeaf();
    SprBlank sprBlank = new SprBlank();
    Timer timer;
    Image background;
    int y;
    int nGrav = 3, nSpeed;
    String sSprite = "Blank";

    public PanEarth() {

        setFocusable(true);
        ImageIcon i1 = new ImageIcon("street.jpg");
        background = i1.getImage();
        timer = new Timer(1, this);
        timer.start();

    }

    public void setSprite(String _sSprite) {
        sSprite = _sSprite;
    }

    public void actionPerformed(ActionEvent arg0) {

        //sprAnvil.move();
        repaint();
    }

    public void reset() {
        if (sSprite.equals("Anvil")) {
            sprAnvil.reset();
        } else if (sSprite.equals("Person")) {
            sprSkydiver.reset();
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
            g2d.drawImage(sprSkydiver.getImage(), sprSkydiver.getX(), sprSkydiver.getY(), null);
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
            sprSkydiver.falling(nSpeed);
        } else if (sSprite.equals("Leaf")) {
            nSpeed = nGrav;
            sprLeaf.falling(nSpeed);
        }
    }

    void display(int n) {
    }
}