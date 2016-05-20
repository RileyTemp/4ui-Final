package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanSpace extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP;
    SprRocket sprRocket = new SprRocket();
    private Timer timer;
    private Image background;
    static String sName;
    Label JLabel;
    int dx, dy;
    int nSpeed = 20;
    int nCount = 0;

    public PanSpace() {
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("space.jpg");
        background = i1.getImage();
        //timer = new Timer(80,this);
        // timer.start();
    }

    public void Timer(Timer timer) {
        timer = new Timer(80, this);
        timer.start();
        nCount++;
        System.out.println(nCount);
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
            dy = 0;
            dx = 0;
        }

        @Override
        public void keyPressed(KeyEvent w) {
            int code = w.getKeyCode();
            if (code == KeyEvent.VK_A) {
                sprRocket.i = 0;
                dx = -nSpeed;
                sprRocket.x += dx;
                if (sprRocket.x <= -245) {
                    sprRocket.x = 1000;
                }
            } else if (code == KeyEvent.VK_D) {
                sprRocket.i = 1;
                dx = nSpeed;
                sprRocket.x += dx;
                if (sprRocket.x >= 1000) {
                    sprRocket.x = -255;
                }
            } else if (code == KeyEvent.VK_W) {
                sprRocket.i = 2;
                dy = -nSpeed;
                sprRocket.y += dy;
                if (sprRocket.y <= -220) {
                    sprRocket.y = 650;
                }
            } else if (code == KeyEvent.VK_S) {
                sprRocket.i = 3;
                dy = nSpeed;
                sprRocket.y += dy;
                if (sprRocket.y >= 650) {
                    sprRocket.y = -220;
                }
            }
        }
    }

    void display(int n) {
    }

    void SpeedChange(String _s) {
        String Change = _s;
        System.out.println(Change);
        if (Change.equals("Speed Up")) {
            nSpeed += 10;
        } else if (Change.equals("Slow Down")) {
            nSpeed -= 10;
        };
    }
}