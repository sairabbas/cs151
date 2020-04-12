import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Hw2P2
{
    public static void main (String[] args) throws FileNotFoundException
    {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        ArrayList<String> data = new ArrayList<String>();
        while (scan.hasNextLine())
        { data.add(scan.nextLine()); }
        scan.close();

        DataModel model = new DataModel(data);

        TextView textView = new TextView(model);
        GraphView graphView = new GraphView(model);

        JFrame frameText = new JFrame();
        frameText.setContentPane(textView);
        frameText.pack();
        frameText.setVisible(true);

        JFrame frameGraph = new JFrame();
        frameGraph.setContentPane(graphView);
        frameGraph.setBounds(95,26,25 * data.size(),28 * data.size());
        frameGraph.setVisible(true);

        frameText.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                super.windowClosing(e);
                try
                {
                    PrintWriter writer = new PrintWriter(new FileWriter(args[0]));
                    for (String number: data)
                    {
                        writer.write(number + "\n");
                    }
                    writer.close();
                }
                catch (IOException exception)
                {
                    exception.printStackTrace();
                }
            }
        });

        frameGraph.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                super.windowClosing(e);
                try
                {
                    PrintWriter writer = new PrintWriter(new FileWriter(args[0]));
                    for (String number: data)
                    {
                        writer.write(number + "\n");
                    }
                    writer.close();
                }
                catch (IOException exception)
                {
                    exception.printStackTrace();
                }
            }
        });
    }
}
