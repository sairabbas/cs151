import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        TheaterSystem theaterSystem = new TheaterSystem();
        Reservation reservation = new Reservation();
        ReservationManager reservationManager = new ReservationManager();
        User user = new User();
        Scanner scan = new Scanner(System.in);
        String option = "";
        LocalDate date;
        LocalTime time;
        while (!option.equals("X"))
        {
            theaterSystem.initialMenu();
            System.out.print("Enter option: ");
            option = scan.nextLine();
            if (option.equals("X")) { break; }
            else if (option.equals("U"))
            {
                user.signUp();
                user.signIn();
            }
            else if (option.equals("I")) { user.signIn();}
            theaterSystem.transactionMenu();
            while (!option.equals("O"))
            {
                System.out.print("Enter option: ");
                option = scan.nextLine();
                if (option.equals("R"))
                {
                    reservation.Reserve();
                }
                else if (option.equals("r"))
                    reservation.viewReservations();
                theaterSystem.transactionMenu();
            }
        }
        System.out.println("Program terminated");
    }
}
