import java.util.Scanner;

public class User
{
    String id, password;
    Scanner scan = new Scanner(System.in);
    public void signIn()
    {
        UserSystem userSystem = new UserSystem();
        System.out.println("Signing In");
        User user = new User();
        System.out.print("Enter username: ");
        user.id = scan.nextLine();
        System.out.print("Enter password: ");
        user.password = scan.nextLine();
        while(userSystem.validateUser(user) != true)
        {
            System.out.println("Username or password was incorrect, please re-enter again");
            System.out.print("Enter username: ");
            user.id = scan.nextLine();
            System.out.print("Enter password: ");
            user.password = scan.nextLine();
            userSystem.validateUser(user);
        }
    }
    public void signUp()
    {
        UserSystem userSystem = new UserSystem();
        System.out.println("Signing Up");
        User user = new User();
        System.out.print("Enter username: ");
        user.id = scan.nextLine();
        while(userSystem.validateUserName(user.id) != true)
        {
            System.out.println("Username is already taken, please re-enter again");
            System.out.print("Enter username: ");
            user.id = scan.nextLine();
            userSystem.validateUserName(user.id);
        }
        System.out.print("Enter password: ");
        user.password = scan.nextLine();
        userSystem.addUser(user);
    }
}
