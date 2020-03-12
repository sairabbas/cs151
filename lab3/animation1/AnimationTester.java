import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 This program implements an animation that moves
 a car shape.
 */
public class AnimationTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        MovableShape shape = new CarShape(0, 0, CAR_WIDTH);
        MovableShape shape1 = new CarShape(0, 50, CAR_WIDTH);

        ShapeIcon icon = new ShapeIcon(shape,
                ICON_WIDTH, ICON_HEIGHT);
        ShapeIcon icon1 = new ShapeIcon(shape1,
                ICON_WIDTH, ICON_HEIGHT);

        JLabel label = new JLabel(icon);
        JLabel label1 = new JLabel(icon1);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(label1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;
        // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, event ->
        {
            shape.move();
            label.repaint();
            shape1.move();
            label.repaint();
        });
        t.start();
    }

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100;
}

