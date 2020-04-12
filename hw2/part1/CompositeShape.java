import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;

public class CompositeShape implements Shape
{
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void add(Shape s)
    {
        shapes.add(s);
    }

    @Override
    public Rectangle getBounds()
    {
        for (Shape shape: shapes)
        {
            return shape.getBounds();
        }
        return null;
    }

    @Override
    public Rectangle2D getBounds2D()
    {
        for (Shape shape: shapes)
        {
            return shape.getBounds2D();
        }
        return null;
    }

    @Override
    public boolean contains(double v, double v1)
    {
        for (Shape shape: shapes)
        {
            if (shape.contains(v,v1))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(Point2D point2D)
    {
        for (Shape shape: shapes)
        {
            if (shape.contains(point2D))
                return true;
        }
        return false;
    }

    @Override
    public boolean intersects(double v, double v1, double v2, double v3)
    {
        for (Shape shape: shapes)
        {
            if (shape.intersects(v, v1, v2, v3))
                return true;
        }
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D rectangle2D)
    {
        for (Shape shape: shapes)
        {
            if (shape.intersects(rectangle2D))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(double v, double v1, double v2, double v3)
    {
        for (Shape shape: shapes)
        {
            if (shape.contains(v,v1,v2,v3))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(Rectangle2D rectangle2D)
    {
        for (Shape shape: shapes)
        {
            if (shape.contains(rectangle2D))
                return true;
        }
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform affineTransform)
    {
        return new PathIterator()
        {
            private PathIterator currentPathIterator;
            private Iterator<Shape> shapesIterator;

            //Constructor
            {
                shapesIterator = shapes.iterator();
                nextShape();
            }

            private void nextShape()
            {
                if (shapesIterator.hasNext())
                    currentPathIterator = shapesIterator.next().getPathIterator(affineTransform);
                else
                    currentPathIterator = null;
            }

            @Override
            public int getWindingRule() {
                return 0;
            }

            @Override
            public boolean isDone()
            {
                if (currentPathIterator == null)
                    return true;
                if (!currentPathIterator.isDone())
                    return false;
                nextShape();
                return isDone();
            }

            @Override
            public void next()
            {
                currentPathIterator.next();
            }

            @Override
            public int currentSegment(float[] coordinates)
            {
                return currentPathIterator.currentSegment(coordinates);
            }

            @Override
            public int currentSegment(double[] coordinates)
            {
                return currentPathIterator.currentSegment(coordinates);
            }
        };
    }

    @Override
    public PathIterator getPathIterator(AffineTransform affineTransform, double v)
    {
        return new PathIterator()
        {
            private PathIterator currentPathIterator;
            private Iterator<Shape> shapesIterator;

            //Constructor
            {
                shapesIterator = shapes.iterator();
                nextShape();
            }

            private void nextShape()
            {
                if (shapesIterator.hasNext())
                    currentPathIterator = shapesIterator.next().getPathIterator(affineTransform, v);
                else
                    currentPathIterator = null;
            }

            @Override
            public int getWindingRule() {
                return 0;
            }

            @Override
            public boolean isDone()
            {
                if (currentPathIterator == null)
                    return true;
                if (!currentPathIterator.isDone())
                    return false;
                nextShape();
                return isDone();
            }

            @Override
            public void next()
            {
                currentPathIterator.next();
            }

            @Override
            public int currentSegment(float[] coordinates)
            {
                return currentPathIterator.currentSegment(coordinates);
            }

            @Override
            public int currentSegment(double[] coordinates)
            {
                return currentPathIterator.currentSegment(coordinates);
            }
        };
    }
}