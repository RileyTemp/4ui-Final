package Final;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PanSidewalk extends JPanel implements ActionListener {

    static boolean drawn = false;
    SprPerson sprPerson = new SprPerson();
    Timer timer;
    Image background;
    String sName;
    Timer timerMove;
    double dx, dy;
    String sDir;
    int i;
    double dVel = 5, dAcc;
    int nCount = 0;

    public PanSidewalk() {

        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("sidewalk.jpg");
        background = i1.getImage();
        timerMove = new Timer(50, Mover);
    }

    public void Timer(Timer timer) {
        timer = new Timer(1, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent arg0) {

        sprPerson.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(sprPerson.getImage(), sprPerson.getX(), sprPerson.getY(), null);
    }

    private class Movement extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent w) {
            System.out.println(sDir);
            if (sDir.equals("a") || sDir.equals("d") || sDir.equals("w") || sDir.equals("s")) {
                timerMove.start();
                dAcc = .86;
            } else {
            }
        }

        @Override
        public void keyPressed(KeyEvent w) {
            int code = w.getKeyCode();
            timerMove.stop();
            dAcc = 1.01;
            if (code == KeyEvent.VK_A) {
                i = 0;
                sprPerson.setSide(i);
                sDir = "a";
                dVel *= dAcc;
                dx = -dVel;
                sprPerson.setX(dx);
            } else if (code == KeyEvent.VK_D) {
                i = 1;
                sprPerson.setSide(i);
                sDir = "d";
                dVel *= dAcc;
                dx = dVel;
                sprPerson.setX(dx);
            } else if (code == KeyEvent.VK_W) {
                sDir = "w";
                dVel *= dAcc;
                dy = -dVel;
                sprPerson.setY(dy);
            } else if (code == KeyEvent.VK_S) {
                sDir = "s";
                dVel *= dAcc;
                dy = dVel;
                sprPerson.setY(dy);
            } else {
                sDir = "none of the above";
            }
            if (dVel > 20) {
                dVel = 20;
            }
        }
    }
    ActionListener Mover = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount++;
            dVel *= dAcc;
            if (sDir.equals("a")) {
                dx = -dVel;
                sprPerson.setX(dx);
            } else if (sDir.equals("d")) {
                dx = dVel;
                sprPerson.setX(dx);
            } else if (sDir.equals("w")) {
                dy = -dVel;
                sprPerson.setY(dy);
            } else if (sDir.equals("s")) {
                dy = dVel;
                sprPerson.setY(dy);
            }

            if (dVel <= .5) {
                timerMove.stop();
                dVel = 5;
            }
        }
    };
}