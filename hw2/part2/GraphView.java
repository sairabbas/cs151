import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

public class GraphView extends JPanel implements Observer
{
    DataModel model;
    MouseListener mouseListener = new MouseListener();
    private static final int HEIGHT = 20;
    public GraphView(DataModel m)
    {
        model = m;
        model.addObserver(this);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < model.getData().size(); i++)
        {
            if (i == 0)
                g2.drawRect(0,0, Integer.parseInt(model.getData().get(i)), HEIGHT);
            else
                g2.drawRect(0, HEIGHT * i, Integer.parseInt(model.getData().get(i)), HEIGHT);
        }
    }
    class MouseListener extends MouseAdapter
    {
        public MouseListener()
        {
          addMouseListener(new MouseAdapter()
          {
              @Override
              public void mousePressed(MouseEvent e)
              {
                  super.mousePressed(e);
                  model.updateData(e.getY()/20, String.valueOf(e.getX()));
              }
          });
        }
    }
    public void update(Observable observable, Object o)
    {
        repaint();
    }
}
