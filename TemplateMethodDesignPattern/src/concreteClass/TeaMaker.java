package concreteClass;

import abstractClass.BeverageMaker;

public class TeaMaker extends BeverageMaker {
    @Override
    public void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    public void breaw() {
        System.out.println("Steeping the tea");
    }
}
