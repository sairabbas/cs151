public class ChicagoStyle extends Pizza
{
    @Override
    public void makeCrust() {
        System.out.println("Making pizza crust Chicago style");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding Chicago style toppings to pizza");
    }

    @Override
    public void preHeatOven() {
        System.out.println("Preheating oven for Chicago style pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Chicago style pizza");
    }
}
