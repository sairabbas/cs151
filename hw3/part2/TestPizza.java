public class TestPizza
{
    public static void main(String[] args)
    {
        ChicagoStyle chicagoStyle = new ChicagoStyle();
        CaliforniaStyle californiaStyle = new CaliforniaStyle();
        NewYorkStyle newYorkStyle = new NewYorkStyle();
        System.out.println("***Testing Chicago Style***");
        chicagoStyle.makeFromScratch();
        System.out.print("\n");
        System.out.println("***Testing California Style***");
        californiaStyle.makeFromScratch();
        System.out.print("\n");
        System.out.println("***Testing New York Style***");
        newYorkStyle.makeFromScratch();
    }
}
