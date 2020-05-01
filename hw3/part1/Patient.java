public class Patient extends Personnel
{
    public Patient(String name, String id)
    {
        super(name, id);
    }
    public void recover()
    {
        System.out.println("Patient is treated and recovers");
    }
}
