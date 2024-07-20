package decorator;

import component.Coffee;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Milk";
    }

    @Override
    public Double getCost() {
        return super.getCost()+0.5;
    }
}
