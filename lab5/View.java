import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class View
{
    int element = 0;
    Model model = new Model();
    Controller controller = new Controller();
    JTextArea textArea = new JTextArea(20, 15);
    JScrollPane scrollPane = new JScrollPane(textArea);
    public View()
    {
        JFrame frame = new JFrame();
        textArea.setEditable(false);
        frame.add(scrollPane);
        frame.add(controller.addButton, BorderLayout.NORTH);
        frame.add(controller.textField, BorderLayout.SOUTH);
        frame.add(textArea, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public class Controller implements ActionListener
    {
        JButton addButton = new JButton("Add");
        final int FIELD_WIDTH = 20;
        final JTextField textField;
        public String updateText() { return model.getText().get(element); }
        public Controller()
        {
            textField = new JTextField(FIELD_WIDTH);
            addButton.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e)
        {
            model.addText(textField.getText());
            textArea.append(updateText() + "\n");
            textField.selectAll();
            element++;
        }
    }
}
