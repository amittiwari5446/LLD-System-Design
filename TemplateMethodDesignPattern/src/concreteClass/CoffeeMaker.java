package concreteClass;

import abstractClass.BeverageMaker;

public class CoffeeMaker extends BeverageMaker {
    @Override
    public void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    public void breaw() {
        System.out.println("dripping coffee through filter");
    }
}
