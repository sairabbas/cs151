import java.util.ArrayList;

public class UserSystem
{
    ArrayList<User> users = new ArrayList<User>();
    public boolean validateUser(User user)
    {
        for (int i = 0; i < users.size(); i++)
        {
            if (user.id.equals(users.get(i).id) && user.password.equals(users.get(i).password))
                return false;
        }
        return true;
    }
    public boolean validateUserName(String username)
    {
        for (int i = 0; i < users.size(); i++)
        {
            if (username.equals(users.get(i).id))
                return false;
        }
        return true;
    }
    public void addUser(User user)
    {
        users.add(user);
    }
}
