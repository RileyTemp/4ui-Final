package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanSpace extends JPanel {

    static boolean drawn = false;
    Rectangle rB, rE, rP; // rectangles for the 3 sprites.
    //SprPerson sprPerson = new SprPerson();
    //private Enemy e;
    private Timer timer;
    private Image background;
    static String sName;
    Label JLabel;
    int nChange = 1;
    JButton btnAcc;

    public PanSpace() {
        //super();
        //sprPerson = new SprPerson();
        //e = new Enemy();
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("space.jpg");
        background = i1.getImage();

    }

    public void actionPerformed(ActionEvent arg0) {
        //Label();
        //sprPerson.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        // g2d.drawImage(sprPerson.getImage(), sprPerson.getX(), sprPerson.getY(), null);
        //g2d.drawImage(e.getImage(), e.getX(), e.getY(), null);
        //isHit();
    }

    /*boolean isHit() {
     rB = p.getRect();
     rE = e.getRect();
     if (rB.intersects(rE)) {
     System.out.println("HIT");
     return true;

     } else {
     return false;
     }

     }*/
    private class Movement extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent w) {
            //sprPerson.keyReleased(w);
        }

        @Override
        public void keyPressed(KeyEvent w) {
            // sprPerson.keyPressed(w);
        }
    }

    void display(int n) {
    }
}
