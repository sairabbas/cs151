public class NewYorkStyle extends Pizza
{
    @Override
    public void makeCrust() {
        System.out.println("Making pizza crust New York style");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding New York style toppings to pizza");
    }

    @Override
    public void preHeatOven() {
        System.out.println("Preheating oven for New York style pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking New York style pizza");
    }
}
