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

        JButton goodbyeButton = new JButton("Say Goodbye");

        frame.setLayout(new FlowLayout());
        frame.add(helloButton);
        frame.add(goodbyeButton);
        frame.add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int[] hi = {0};
        final int[] bye = {0};
        goodbyeButton.setEnabled(false);
        helloButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                hi[0]++;
                textField.setText("Hello " + hi[0]);
                goodbyeButton.setEnabled(true);
                helloButton.setEnabled(false);
            }});
        goodbyeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                bye[0]++;
                textField.setText("Goodbye " + bye[0]);
                helloButton.setEnabled(true);
                goodbyeButton.setEnabled(false);
            }});
    }
}
