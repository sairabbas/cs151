import javax.swing.*;
import java.awt.*;

public class BoxedIcon implements Icon
{
    private Icon icon;
    public BoxedIcon(Object i)
    { icon = (Icon) i; }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        g.drawRect(0, 0, icon.getIconWidth()+20, icon.getIconHeight()+20);
        icon.paintIcon(c,g,10,10);
    }
    @Override
    public int getIconWidth()
    { return icon.getIconWidth()+20; }
    @Override
    public int getIconHeight()
    { return icon.getIconHeight()+20; }
}
