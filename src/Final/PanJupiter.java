package Final;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class PanJupiter extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP;
    SprRock sprRock = new SprRock();
    private Timer timer;
    Timer timerMove;
    private Image background;
    static String sName;
    Label JLabel;
    int dx, dy;
    int Speed = 5;
    String s;
    int nCount = 0;
    String sSame = "h";

    public PanJupiter() {

        setFocusable(true);
        ImageIcon i1 = new ImageIcon("jupiter.jpg");
        background = i1.getImage();
        timer = new Timer(80, this);
        timer.start();

    }

    public void actionPerformed(ActionEvent arg0) {

        //sprRock.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(sprRock.getImage(), sprRock.getX(), sprRock.getY(), null);
    }

    public void moveSprite() {
        System.out.println("bigger");
        sprRock.falling();
    }

    void display(int n) {
    }
}