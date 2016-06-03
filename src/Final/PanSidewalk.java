package Final;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PanSidewalk extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP;
    SprPerson sprPerson = new SprPerson();
    private Timer timer;
    private Image background;
    static String sName;
    Label JLabel;
    int dx, dy;
    int Speed = 5;
    PanTimer panTimer;
    String s;
    int nCount = 0;
    String sSame = "h";

    public PanSidewalk(PanTimer _panTimer) {
        panTimer = _panTimer;
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("sidewalk.jpg");
        background = i1.getImage();
    }

    public void Timer(Timer timer) {
        timer = new Timer(80, this);
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
        public void keyPressed(KeyEvent w) {
            int code = w.getKeyCode();
            System.out.println(sSame);
            if (code == KeyEvent.VK_A) {
                s = "a";
                if (!sSame.equals(s)) {
                    Speed = 5;
                }
                sprPerson.setSide(0);
                sSame = s;
                panTimer.start(s);
                dx = -Speed;
                sprPerson.setX(dx);
                if (panTimer.nCount > nCount) {
                    Speed += 1;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_D) {
                s = "d";
                if (!sSame.equals(s)) {
                    Speed = 5;
                }
                sprPerson.setSide(1);
                sSame = s;
                panTimer.start(s);
                dx = Speed;
                sprPerson.setX(dx);
                if (panTimer.nCount > nCount) {
                    Speed += 1;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_W) {
                s = "w";
                if (!sSame.equals(s)) {
                    Speed = 5;
                }
                sSame = s;
                panTimer.start(s);
                dy = -Speed;
                sprPerson.setY(dy);
                if (panTimer.nCount > nCount) {
                    Speed += 1;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_S) {
                s = "s";
                if (!sSame.equals(s)) {
                    Speed = 5;
                }
                sSame = s;
                panTimer.start(s);
                dy = Speed;
                sprPerson.setY(dy);
                if (panTimer.nCount > nCount) {
                    Speed += 1;
                    nCount = panTimer.nCount;
                }
            }
            if (Speed > 15) {
                Speed = 15;
            }
        }
    }

    void display(int n) {
    }
}