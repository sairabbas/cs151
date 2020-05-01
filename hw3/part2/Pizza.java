public abstract class Pizza
{
    //Template method, final so subclasses cannot override
    public final void makeFromScratch()
    {
        makeCrust();
        addToppings();
        preHeatOven();
        cook();
    }
    //Methods to be implemented by subclasses
    public abstract void makeCrust();
    public abstract void addToppings();
    public abstract void preHeatOven();
    public abstract void cook();
}
