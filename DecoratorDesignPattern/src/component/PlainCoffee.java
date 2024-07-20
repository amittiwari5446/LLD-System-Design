package component;

public class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "plain coffee";
    }

    @Override
    public Double getCost() {
        return 2.0;
    }
}
