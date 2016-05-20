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
    int nSpeed = 10;

    public PanRoad() {
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
            if (code == KeyEvent.VK_A) {
                sprCar.i = 0;
                dx = -nSpeed;
                sprCar.x += dx;
                if (sprCar.x <= -245) {
                    sprCar.x = 1000;
                }
            } else if (code == KeyEvent.VK_D) {
                sprCar.i = 1;
                dx = nSpeed;
                sprCar.x += dx;
                if (sprCar.x >= 1000) {
                    sprCar.x = -255;
                }
            } else if (code == KeyEvent.VK_W) {
                dy = -nSpeed;
                sprCar.y += dy;
                if (sprCar.y <= -220) {
                    sprCar.y = 650;
                }
            } else if (code == KeyEvent.VK_S) {
                dy = nSpeed;
                sprCar.y += dy;
                if (sprCar.y >= 650) {
                    sprCar.y = -220;
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
            nSpeed += 5;
        } else if (Change.equals("Slow Down")) {
            nSpeed -= 5;
        }
    }
}