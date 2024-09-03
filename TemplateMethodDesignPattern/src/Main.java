import abstractClass.BeverageMaker;
import concreteClass.CoffeeMaker;
import concreteClass.TeaMaker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making Tea: ");
        BeverageMaker teaMaker= new TeaMaker();
        teaMaker.makeBeverage();

        System.out.println("-----------------------------------");

        System.out.println("Making Coffee: ");
        BeverageMaker coffeeMaker=new CoffeeMaker();
        coffeeMaker.makeBeverage();
    }
}