import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;
public class TheaterReservationSystem
{
    static Scanner in = new Scanner(System.in);
    public static class ReservationSystem
    {
        static void initialMenu()
        {
            System.out.println("Sign [U]p   Sign [I]n   E[X]it");
        }
        static void transactionMenu()
        {
            System.out.println("[R]eserve    [V]iew    [C]ancel    [O]ut");
        }
    }
    public static class Show
    {
        static LocalDate start = LocalDate.of(2020, 12, 23);
        static LocalDate end = LocalDate.of(2021, 1, 2);
        static String title = "Miracle on 34th Street";
    }

    public static class User
    {
       public static String id, password;
       public User(String id, String password)
       {
           this.id = id;
          this.password = password;
       }
    }

    public static class UserDB
    {
        User user;
        static ArrayList<User> users;
        public static void addUser(User u)
        {
            users.add(u);
        }
        public static void signUp(String u)
        {
            boolean exists = true;
            while(exists != false)
            {
                for (int i = 0; i < users.size(); i++)
                {
                    if (u.equals(users.get(i).id))
                        break;
                    else
                        exists = false;
                }
                    System.out.println("Username is taken, please re-enter: ");
                    u = in.nextLine();
            }
        }
        public static void signIn(User u)
        {
            boolean exists = false;
            while (exists != true)
            {
                for (int i = 0; i < users.size(); i++)
                {
                    if (u == users.get(i))
                        exists = true;
                }
                System.out.println("Username does not exist/incorrect password, please re-enter");
                System.out.println("Enter username: ");
                u.id = in.nextLine();
                System.out.println("Enter password: ");
                u.password = in.nextLine();
            }
        }
    }

    public static class Reservation
    {
        LocalDateTime date;
        LocalDateTime time;
        ArrayList<String> seats;
        User user;
    }

    public static class ReservationManager
    {
        Reservation reservation;
        ArrayList<Reservation> reservations;
    }
}
