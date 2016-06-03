package Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SprPerson {

    private Image img;
    int i;
    int x, y, bx, by, dx, dy, backgroundX;
    int Speed = 5;
    boolean left, right, up, down;
    ImageIcon p1 = new ImageIcon("walkingL.png");// Looking Left
    ImageIcon p2 = new ImageIcon("walkingR.png");// Looking Right
    int imgWidth = p1.getIconHeight();
    int imgHeight = p2.getIconWidth();
    Image arnRunning_R[] = new Image[2];
    Rectangle r;

    public SprPerson() {
        r = new Rectangle();
        x = 550;
        y = 200;
        dx = 0;
        dy = 0;
        left = false;
        right = false;
        up = false;
        down = false;
        arnRunning_R[0] = p1.getImage();
        arnRunning_R[1] = p2.getImage();

    }

    public Rectangle getRect() {
        r.setBounds(x, y, imgWidth, imgHeight);
        return r;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        img = arnRunning_R[i];
        return img;
    }

    public void setSide(int _i) {
        i = _i;
    }

    public void setY(int _dy) {
        dy = _dy;
        y += dy;
        dy = 0;
        if (y <= -220) {
            y = 650;
        } else if (y >= 650) {
            y = -220;
        }
    }

    public void setX(int _dx) {
        dx = _dx;
        x += dx;
        dx = 0;
        if (x >= 1000) {
            x = -255;
        } else if (x <= -255) {
            x = 1000;
        }
    }
}
/*if (sprPerson.x >= 1000) {
                    sprPerson.x = -255;
                }*/