public class Doctor extends Personnel
{
    public Doctor(String name, String id)
    {
        super(name, id);
    }
    public void doctor()
    {
        System.out.println("Doctor diagnoses and treats patient");
    }
}
