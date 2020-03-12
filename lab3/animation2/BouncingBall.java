import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D;
public class BouncingBall implements MovableShape
{
    final int width;
    int x = 0, y = 0, speedX = 1, speedY = 2;
    public BouncingBall(int x, int y, int width)
    {
        this.x = x;
        this.y = y;
        this.width = width;
    }
    public void move()
    {
        y = y + speedY;
        if (y % 25 == 0)
        {
            speedY = -speedY;
        }
    }
    public void draw(Graphics2D g2)
    {
        Shape ellipse = new Ellipse2D.Double(x, y, 25, 25);
        g2.draw(ellipse);
    }
}
