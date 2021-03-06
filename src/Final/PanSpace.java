package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanSpace extends JPanel implements ActionListener {

    static boolean drawn = false;
    SprRocket sprRocket = new SprRocket();
    Timer timer;
    Timer timerMove;
    Image background;
    int i = 0;
    double dVel = 20, dAcc, dx, dy;
    String sDir;

    public PanSpace() {
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("space.jpg");
        background = i1.getImage();
        timerMove = new Timer(50, Mover);
    }

    public void Timer(Timer timer) {
        timer = new Timer(1, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent arg0) {

        sprRocket.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(sprRocket.getImage(), sprRocket.getX(), sprRocket.getY(), null);
    }

    private class Movement extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent w) {
            System.out.println(sDir);
            if (sDir.equals("a") || sDir.equals("d") || sDir.equals("w") || sDir.equals("s")) {
                timerMove.start();
                dAcc = .9;
            } else {
            }
        }

        @Override
        public void keyPressed(KeyEvent w) {
            int code = w.getKeyCode();
            timerMove.stop();
            dAcc = 1.07;
            if (code == KeyEvent.VK_A) {
                i = 0;
                sprRocket.setSide(i);
                sDir = "a";
                dVel *= dAcc;
                dx = -dVel;
                sprRocket.setX(dx);
            } else if (code == KeyEvent.VK_D) {
                i = 1;
                sprRocket.setSide(i);
                sDir = "d";
                dVel *= dAcc;
                dx = dVel;
                sprRocket.setX(dx);
            } else if (code == KeyEvent.VK_W) {
                i = 2;
                sprRocket.setSide(i);
                sDir = "w";
                dVel *= dAcc;
                dy = -dVel;
                sprRocket.setY(dy);
            } else if (code == KeyEvent.VK_S) {
                i = 3;
                sprRocket.setSide(i);
                sDir = "s";
                dVel *= dAcc;
                dy = dVel;
                sprRocket.setY(dy);
            } else {
                sDir = "none of the above";
            }

            if (dVel > 75) {
                dVel = 75;
            }
        }
    }
    ActionListener Mover = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            dVel *= dAcc;
            if (sDir.equals("a")) {
                dx = -dVel;
                sprRocket.setX(dx);
            } else if (sDir.equals("d")) {
                dx = dVel;
                sprRocket.setX(dx);
            } else if (sDir.equals("w")) {
                dy = -dVel;
                sprRocket.setY(dy);
            } else if (sDir.equals("s")) {
                dy = dVel;
                sprRocket.setY(dy);
            }

            if (dVel <= .5) {
                timerMove.stop();
                dVel = 5;
            }
        }
    };
}