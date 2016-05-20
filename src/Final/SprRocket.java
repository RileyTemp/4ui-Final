package Final;

import javax.swing.*;
import java.awt.*;

public class SprRocket {

    private Image img;
    int i;
    int x, y, bx, by, dx, dy, backgroundX;
    int Speed = 5;
    boolean left, right, up, down;
    ImageIcon p1 = new ImageIcon("spaceshipL.png");// Looking Left
    ImageIcon p2 = new ImageIcon("spaceshipR.png");// Looking Right
    ImageIcon p3 = new ImageIcon("spaceshipU.png");
    ImageIcon p4 = new ImageIcon("spaceshipD.png");
    int imgWidth = p1.getIconHeight();
    int imgHeight = p2.getIconWidth();
    Image arnRunning_R[] = new Image[4];
    Rectangle r;

    public SprRocket() {
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
        arnRunning_R[2] = p3.getImage();
        arnRunning_R[3] = p4.getImage();
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
}
