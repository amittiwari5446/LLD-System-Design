package decorator;

import component.Coffee;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Sugar";
    }

    @Override
    public Double getCost() {
        return super.getCost()+0.2;
    }
}
