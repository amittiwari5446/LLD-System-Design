import component.Coffee;
import component.PlainCoffee;
import decorator.MilkDecorator;
import decorator.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        //plain coffee
        Coffee coffee=new PlainCoffee();
        System.out.println("Description: "+coffee.getDescription());
        System.out.println("Cost: "+coffee.getCost());

        //milk coffee
        Coffee milkCoffee=new MilkDecorator(new PlainCoffee());
        System.out.println("Description: "+milkCoffee.getDescription());
        System.out.println("Cost: "+milkCoffee.getCost());

        //sugar coffee
        Coffee sugarCoffee=new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("Description: "+sugarCoffee.getDescription());
        System.out.println("Cost: "+sugarCoffee.getCost());
    }
}