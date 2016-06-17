package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanRoad extends JPanel implements ActionListener {

    static boolean drawn = false;
    SprCar sprCar = new SprCar();
    Timer timer;
    Timer timerMove;
    Image background;
    double dx, dy, dVel = 10, dAcc;
    int i;
    String sDir;
    int nCount = 0;

    public PanRoad() {

        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("road.jpg");
        background = i1.getImage();
        timerMove = new Timer(50, Mover);
    }

    public void Timer(Timer timer) {
        timer = new Timer(1, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent arg0) {

        sprCar.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(sprCar.getImage(), sprCar.getX(), sprCar.getY(), null);
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
            dAcc = 1.03;
            if (code == KeyEvent.VK_A) {
                i = 0;
                sprCar.setSide(i);
                sDir = "a";
                dVel *= dAcc;
                dx = -dVel;
                sprCar.setX(dx);
            } else if (code == KeyEvent.VK_D) {
                sprCar.setSide(i);
                i = 1;
                sDir = "d";
                dVel *= dAcc;
                dx = dVel;
                sprCar.setX(dx);
            } else if (code == KeyEvent.VK_W) {
                sDir = "w";
                dVel *= dAcc;
                dy = -dVel;
                sprCar.setY(dy);
            } else if (code == KeyEvent.VK_S) {
                sDir = "s";
                dVel *= dAcc;
                dy = dVel;
                sprCar.setY(dy);
            } else {
                sDir = "none of the above";
            }
            if (dVel > 50) {
                dVel = 50;
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
                sprCar.setX(dx);
            } else if (sDir.equals("d")) {
                dx = dVel;
                sprCar.setX(dx);
            } else if (sDir.equals("w")) {
                dy = -dVel;
                sprCar.setY(dy);
            } else if (sDir.equals("s")) {
                dy = dVel;
                sprCar.setY(dy);
            }
            if (dVel <= .5) {
                timerMove.stop();
                dVel = 5;
            }
        }
    };
}