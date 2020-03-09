import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Reservation
{

    Scanner scan = new Scanner(System.in);
    LocalDate date;
    LocalTime time;
    User user;
    Ticket ticket = new Ticket();
    ReservationManager reservationManager = new ReservationManager();
    public void viewReservations()
    {
        ReservationManager reservationManager = new ReservationManager();
        System.out.println(reservationManager.reservations.size());
        for (int i = 0; i < reservationManager.reservations.size(); i++)
        {
            System.out.println(reservationManager.reservations.get(i).user.toString() + " " +
                    reservationManager.reservations.get(i).date.toString() + " " +
                    reservationManager.reservations.get(i).time.toString() + " " +
                    reservationManager.reservations.get(i).ticket.seats.toString());
        }
    }
    public void Reserve()
    {
        Reservation reservation = new Reservation();
        String seat = "";
        System.out.print("Enter date [yyyy-mm-dd]: ");
        date = LocalDate.parse(scan.next());
        System.out.print("Enter time [hh:mm]: ");
        time = LocalTime.parse(scan.next());
        reservationManager.displaySeats(date);
        System.out.print("How many seats would you like to reserve?: ");
        int seats = scan.nextInt();
        for (int i = 1; i < seats + 1; i++)
        {
            System.out.print("Enter seat" + i + ": ");
            seat = scan.next();
            while (reservationManager.validateSeat(seat, date) == true)
            {
                System.out.print("Seat is already reserved, please re-enter again: ");
                seat = scan.nextLine();
                reservationManager.validateSeat(seat, date);
            }
            reservation.ticket.seats.add(seat);
        }
        reservation.date = date;
        reservation.time = time;
        reservationManager.addReservation(reservation);
    }
}
