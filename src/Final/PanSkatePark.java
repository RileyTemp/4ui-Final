package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanSkatePark extends JPanel implements ActionListener {

    static boolean drawn = false;
    SprSkateboard sprSkateboard = new SprSkateboard();
    Timer timer;
    Image background;
    String sName;
    double dVel = 8, dAcc, dx, dy;
    String sDir;
    int i;
    int nCount = 0;
    Timer timerMove;

    public PanSkatePark() {

        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("skatepark.jpg");
        background = i1.getImage();
        timerMove = new Timer(50, Mover);
    }

    public void Timer(Timer timer) {
        timer = new Timer(1, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent arg0) {

        sprSkateboard.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(sprSkateboard.getImage(), sprSkateboard.getX(), sprSkateboard.getY(), null);
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
            dAcc = 1.02;
            if (code == KeyEvent.VK_A) {
                i = 0;
                sprSkateboard.setSide(i);
                sDir = "a";
                dVel *= dAcc;
                dx = -dVel;
                sprSkateboard.setX(dx);
            } else if (code == KeyEvent.VK_D) {
                sprSkateboard.setSide(i);
                i = 1;
                sDir = "d";
                dVel *= dAcc;
                dx = dVel;
                sprSkateboard.setX(dx);
            } else if (code == KeyEvent.VK_W) {
                sDir = "w";
                dVel *= dAcc;
                dy = -dVel;
                sprSkateboard.setY(dy);
            } else if (code == KeyEvent.VK_S) {
                sDir = "s";
                dVel *= dAcc;
                dy = dVel;
                sprSkateboard.setY(dy);
            } else {
                sDir = "none of the above";
            }

            if (dVel > 35) {
                dVel = 35;
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
                sprSkateboard.setX(dx);
            } else if (sDir.equals("d")) {
                dx = dVel;
                sprSkateboard.setX(dx);
            } else if (sDir.equals("w")) {
                dy = -dVel;
                sprSkateboard.setY(dy);
            } else if (sDir.equals("s")) {
                dy = dVel;
                sprSkateboard.setY(dy);
            }

            if (dVel <= .5) {
                timerMove.stop();
                dVel = 5;
            }
        }
    };
}
