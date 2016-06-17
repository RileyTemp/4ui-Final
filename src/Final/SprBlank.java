package Final;

import javax.swing.*;
import java.awt.*;

public class SprBlank {

    private Image img;
    int i;
    int x, y, dx, dy;
    int nSpeed;
    boolean left, right, up, down;
    ImageIcon p1 = new ImageIcon("blank.png");
    int imgWidth = p1.getIconHeight();
    int imgHeight = p1.getIconWidth();
    Image arnRunning_R[] = new Image[1];
    Rectangle r;

    public SprBlank() {
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
}
