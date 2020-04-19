import javax.swing.*;

public class IconTester2
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(
                null,
                "Hello, Boxed Mars!",
                "Message",
                JOptionPane.INFORMATION_MESSAGE,
                new BoxedIcon(new MarsIcon(50)));
        System.exit(0);
    }
}