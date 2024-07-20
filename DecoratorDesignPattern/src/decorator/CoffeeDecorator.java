package decorator;

import component.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }

    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription();
    }

    @Override
    public Double getCost() {
        return decoratorCoffee.getCost();
    }
}
