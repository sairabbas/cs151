import java.util.ArrayList;
import java.util.Observable;

public class DataModel extends Observable
{
    ArrayList<String> data = new ArrayList<String>();
    public DataModel(ArrayList<String> d)
    {
        data = d;
    }
    public ArrayList<String> getData()
    {
        return data;
    }
    public void updateData(int position, String number)
    {
        data.set(position, number);
        setChanged();
        notifyObservers();
    }
}
