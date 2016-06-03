package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanRoad extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP;
    SprCar sprCar = new SprCar();
    private Timer timer;
    private Image background;
    static String sName;
    Label JLabel;
    int dx, dy;
    int Speed = 10;
    PanTimer panTimer;
    String s;
    int nCount = 0;
    String sSame = "h";

    public PanRoad(PanTimer _panTimer) {
        panTimer = _panTimer;
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("road.jpg");
        background = i1.getImage();
        //timer = new Timer(80,this);
        // timer.start();
    }

    public void Timer(Timer timer) {
        timer = new Timer(80, this);
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
            dy = 0;
            dx = 0;
        }

        @Override
        public void keyPressed(KeyEvent w) {
            int code = w.getKeyCode();
            System.out.println(sSame);
            if (code == KeyEvent.VK_A) {
                s = "a";
                if (!sSame.equals(s)) {
                    Speed = 10;
                }
                sprCar.setSide(0);
                sSame = s;
                panTimer.start(s);
                dx = -Speed;
                sprCar.setX(dx);
                if (panTimer.nCount > nCount) {
                    Speed += 5;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_D) {
                s = "d";
                if (!sSame.equals(s)) {
                    Speed = 10;
                }
                sprCar.setSide(1);
                sSame = s;
                panTimer.start(s);
                dx = Speed;
                sprCar.setX(dx);
                if (panTimer.nCount > nCount) {
                    Speed += 5;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_W) {
                s = "w";
                if (!sSame.equals(s)) {
                    Speed = 10;
                }
                sSame = s;
                panTimer.start(s);
                dy = -Speed;
                sprCar.setY(dy);
                if (panTimer.nCount > nCount) {
                    Speed += 5;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_S) {
                s = "s";
                if (!sSame.equals(s)) {
                    Speed = 10;
                }
                sSame = s;
                panTimer.start(s);
                dy = Speed;
                sprCar.setY(dy);
                if (panTimer.nCount > nCount) {
                    Speed += 5;
                    nCount = panTimer.nCount;
                }
            }
            if (Speed > 33) {
                Speed = 33;
            }
        }
    }

    void display(int n) {
    }
}