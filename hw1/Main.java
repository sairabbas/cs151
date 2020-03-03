import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Create scanner for user input/reading file
        Scanner in = new Scanner(System.in);
        //Create file to read reservations data from
        File file = new File("/Users/sairabbas/Desktop/reservations.txt");
        String option = "", id = "", password = "";
        TheaterReservationSystem.User temp = new TheaterReservationSystem.User("", "");
        while(!option.equals("X"))
        {
            //Enters initial menu of program
            TheaterReservationSystem.ReservationSystem.initialMenu();
            option = in.nextLine();
            switch (option)
            {
                case "I":
                {
                    System.out.println("Enter username: ");
                    id = in.nextLine();
                    System.out.println("Enter password: ");
                    password = in.nextLine();
                    TheaterReservationSystem.UserDB.signIn(temp);
                }
                case "U":
                {
                    System.out.println("Enter new username: ");
                    id = in.nextLine();
                    TheaterReservationSystem.UserDB.signUp(temp.id);
                    System.out.println("Enter new password: ");
                    password = in.nextLine();
                    TheaterReservationSystem.UserDB.addUser(temp);
                }
            }
            //Enters transaction mode of program
            TheaterReservationSystem.ReservationSystem.transactionMenu();
        }
    }
}
