import java.util.Iterator;
public class Sequence<E>
{
    //Iterator position
    private int current = 0;
    //Underlying data structure
    private E[] elements = (E[]) new Object[10];
    //Partially fill array
    public Sequence()
    {
        elements[0] = (E) "first";
        elements[1] = (E) "second";
        elements[2] = (E) "third";
    }
    //Client access to elements
    public Iterator<E> getElements()
    {
        return new Iterator<E>()
        {
            //Declare methods
            public boolean hasNext() { return current < elements.length; }
            public E next() { return elements[current++]; }
            public void remove() { throw new UnsupportedOperationException(); }
         };
    }
    //Client
    public static void main(String[] args)
    {
        //Simultaneous client access
        Sequence client1 = new Sequence();
        Sequence client2 = new Sequence();
        Sequence client3 = new Sequence();
        System.out.println("Client one: " + client1.getElements().next());
        System.out.println("Client two: " + client2.getElements().next());
        System.out.println("Client two: " + client2.getElements().next());
        System.out.println("Client three: " + client3.getElements().next());
        System.out.println("Client three: " + client3.getElements().next());
        System.out.println("Client three: " + client3.getElements().next());
    }
}

