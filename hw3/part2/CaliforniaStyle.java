public class CaliforniaStyle extends Pizza
{
    @Override
    public void makeCrust() {
        System.out.println("Making pizza crust California style");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding California style toppings to pizza");
    }

    @Override
    public void preHeatOven() {
        System.out.println("Preheating oven for California style pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking California style pizza");
    }
}
