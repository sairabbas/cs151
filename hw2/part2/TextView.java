import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class TextView extends Box implements Observer
{
    DataModel model;
    ArrayList<JTextField> textFields = new ArrayList<>();
    public TextView (DataModel model)
    {
       super(BoxLayout.Y_AXIS);
       this.model = model;
       model.addObserver(this);
       for (int i = 0; i < model.getData().size(); i++)
       {
           JTextField textField = new JTextField(model.getData().get(i));
           textFields.add(textField);
           final int position = i;
           textField.getDocument().addDocumentListener(new DocumentListener()
           {
               @Override
               public void insertUpdate(DocumentEvent e) {
                   model.updateData(position, textField.getText());
               }
               @Override
               public void removeUpdate(DocumentEvent e) {
                   model.updateData(position, textField.getText());
               }
               @Override
               public void changedUpdate(DocumentEvent e) {
                   model.updateData(position, textField.getText());
               }
           });
           super.add(textField);
       }
    }
    public void update(Observable observable, Object o)
    {
        for (int i = 0; i < model.getData().size(); i++)
        {
            if (!model.getData().get(i).equals(textFields.get(i).getText()))
                textFields.get(i).setText(model.getData().get(i));
        }
    }
}
