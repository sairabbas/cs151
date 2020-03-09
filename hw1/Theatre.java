import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Theatre
{
    LocalDate startDate = LocalDate.of(2020,12,23);
    LocalDate endDate = LocalDate.of(2021,1,2);
    LocalTime startTime = LocalTime.of(6,30);
    LocalTime endTime = LocalTime.of(8,30);
    String title = "Miracle on 34th Street";
    ArrayList<String> seats = new ArrayList<String>();
    public Theatre()
    {
        String M = "", S = "", W = "", E = "";
        for (int m = 1; m < 151; m++)
        {
            M = "m";
            M = M + m;
            seats.add(M);
        }
        for (int s = 1; s < 51; s++)
        {
            S = "s";
            S = S + s;
            seats.add(S);
        }
        for (int w = 1; w < 101; w++)
        {
            W = "w";
            W = W + w;
            seats.add(W);
        }
        for (int e = 1; e < 101; e++)
        {
            E = "e";
            E = E + e;
            seats.add(E);
        }
    }
}
