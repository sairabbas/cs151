import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
public class ReservationManager
{
    LocalDate date;
    LocalTime time;
    ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    Reservation reservation = new Reservation();
    public void displaySeats(LocalDate date)
    {
        Theatre theatre = new Theatre();
        System.out.println("Available seats:");
        for (int i = 0; i < theatre.seats.size(); i++)
        {
            boolean reserved = false;
            for (int j = 0; j < reservations.size(); j++)
            {
                if (date.equals(reservations.get(j).date))
                {
                    for (int k = 0; k < reservations.get(j).ticket.seats.size(); k++)
                    {
                        if (theatre.seats.get(i).equals(reservations.get(j).ticket.seats.get(k)))
                            reserved = true;
                    }
                }
            }
            if (reserved == false)
                System.out.print(theatre.seats.get(i) + " ");
        }
        System.out.println("");
    }
    public boolean validateSeat(String seat, LocalDate date)
    {
        Theatre theatre = new Theatre();
        for (int i = 0; i < reservations.size(); i++)
        {
            if (date.equals(reservations.get(i).date))
            {
                for (int j = 0; j < reservations.get(i).ticket.seats.size(); j++)
                {
                    if (seat.equals(reservations.get(i).ticket.seats.get(j)))
                    return true;
                }
            }
        }
        return false;
    }
    public void addReservation(Reservation reservation)
    {
        reservations.add(reservation);
    }
}
