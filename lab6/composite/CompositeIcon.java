import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class CompositeIcon implements Icon
{
    ArrayList<Icon> icons = new ArrayList<Icon>();
    public void addIcon(Icon icon)
    {
        icons.add(icon);
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        for (Icon icon: icons)
        {
            icon.paintIcon(c,g,x,0);
            x = x + icon.getIconWidth();
        }
    }
    @Override
    public int getIconWidth()
    {
        int temp = 0;
        for (Icon icon: icons)
        { temp = temp + icon.getIconWidth(); }
        return temp;
    }
    @Override
    public int getIconHeight()
    {
        int temp = 0;
        for (Icon icon: icons)
        { temp = temp + icon.getIconHeight(); }
        return temp;
    }
}
