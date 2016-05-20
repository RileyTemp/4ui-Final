
package Final;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class SprCar {
    
    private Image img;
    int i;
    int x, y, bx, by, dx, dy, backgroundX;
    int Speed = 5;
    boolean left, right, up, down;
    ImageIcon p1 = new ImageIcon("carL.png");// Looking Left
    ImageIcon p2 = new ImageIcon("carR.png");// Looking Right
    int imgWidth = p1.getIconHeight();
    int imgHeight = p2.getIconWidth();
    Image arnRunning_R[] = new Image[2];
    Rectangle r;

    public SprCar() {
        r = new Rectangle();
        x = 555;
        y = 120;
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
}
