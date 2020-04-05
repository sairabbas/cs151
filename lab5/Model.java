import java.util.ArrayList;
public class Model
{
    ArrayList<String> text;
    public Model() { text = new ArrayList<>(); }
    public void addText(String t) { text.add(t); }
    public ArrayList<String> getText() { return text; }
}