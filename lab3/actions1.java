import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ActionTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        final int FIELD_WIDTH = 20;
        JTextField textField = new JTextField(FIELD_WIDTH);
        textField.setText("Click a button!");

        JButton helloButton = new JButton("Say Hello");

        helloButton.addActionListener(event ->
                textField.setText("Hello, World!"));

        JButton goodbyeButton = new JButton("Say Goodbye");

       goodbyeButton.addActionListener(event ->
               textField.setText("Goodbye, World!"));

        frame.setLayout(new FlowLayout());
        frame.add(helloButton);
        frame.add(goodbyeButton);
        frame.add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        goodbyeButton.setEnabled(false);
        helloButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                goodbyeButton.setEnabled(true);
                helloButton.setEnabled(false);
            }});
        goodbyeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                helloButton.setEnabled(true);
                goodbyeButton.setEnabled(false);
            }});
    }
}
