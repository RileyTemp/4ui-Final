package Final;

import javax.swing.*;
import java.awt.*;

public class SprMartian {

    private Image img;
    int i;
    int x, y, bx, by, dx, dy, backgroundX;
    int Speed = 5;
    boolean left, right, up, down;
    ImageIcon p1 = new ImageIcon("martian3.png");// Looking Left
    ImageIcon p2 = new ImageIcon("martian3.png");// Looking Right
    int imgWidth = p1.getIconHeight();
    int imgHeight = p2.getIconWidth();
    Image arnRunning_R[] = new Image[2];
    Rectangle r;

    public SprMartian() {
        r = new Rectangle();
        x = 400;
        y = 0;
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

    void setX(int _dx) {
        dx = _dx;
        x += dx;
        dx = 0;
        if (x >= 1000) {
            x = -255;
        } else if (x <= -255) {
            x = 1000;
        }
    }

    void setY(int _dy) {
        dy = _dy;
        y += dy;
        dy = 0;
        if (y <= -220) {
            y = 650;
        } else if (y >= 650) {
            y = -220;
        }
    }

    void falling() {
        y += 5;
    }
}
