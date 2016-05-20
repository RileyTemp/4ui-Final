package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanSkatePark extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP;
    SprSkateboard sprSkateboard = new SprSkateboard();
    private Timer timer;
    private Image background;
    static String sName;
    Label JLabel;
    int dx, dy;
    int nSpeed = 8;

    public PanSkatePark() {
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("skatepark.jpg");
        background = i1.getImage();
    }

    public void Timer(Timer timer) {
        timer = new Timer(80, this);
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
            dy = 0;
            dx = 0;
        }

        @Override
        public void keyPressed(KeyEvent w) {
            int code = w.getKeyCode();
            if (code == KeyEvent.VK_A) {
                sprSkateboard.i = 0;
                dx = -nSpeed;
                sprSkateboard.x += dx;
                if (sprSkateboard.x <= -245) {
                    sprSkateboard.x = 1000;
                }
            } else if (code == KeyEvent.VK_D) {
                sprSkateboard.i = 1;
                dx = nSpeed;
                sprSkateboard.x += dx;
                if (sprSkateboard.x >= 1000) {
                    sprSkateboard.x = -255;
                }
            } else if (code == KeyEvent.VK_W) {
                dy = -nSpeed;
                sprSkateboard.y += dy;
                if (sprSkateboard.y <= -220) {
                    sprSkateboard.y = 650;
                }
            } else if (code == KeyEvent.VK_S) {
                dy = nSpeed;
                sprSkateboard.y += dy;
                if (sprSkateboard.y >= 650) {
                    sprSkateboard.y = -220;
                }
            }
            System.out.println(sprSkateboard.x);
            System.out.println(sprSkateboard.y);
        }
    }

    void display(int n) {
    }

    void SpeedChange(String _s) {
        String Change = _s;
        System.out.println(Change);
        if (Change.equals("Speed Up")) {
            nSpeed += 3;
            System.out.println(nSpeed);
        } else if (Change.equals("Slow Down")) {
            nSpeed -= 3;
            System.out.println(nSpeed);
        }
    }
}
