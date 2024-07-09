import Factory.CarFactory;
import Factory.EuropeCarFactory;
import Factory.NorthAmericaCarFactory;
import Product.Car;
import specification.CarSpecification;

public class Main {
    public static void main(String[] args) {
        CarFactory northAmericaCarFactory=new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaCarFactory.createCar();
        CarSpecification northAmericaCarSpecification=northAmericaCarFactory.createCarSpecification();

        northAmericaCar.assemble();
        northAmericaCarSpecification.display();

        CarFactory europeCarFactory=new EuropeCarFactory();
        Car europeCar = europeCarFactory.createCar();
        CarSpecification europeCarSpecification=europeCarFactory.createCarSpecification();

        europeCar.assemble();
        europeCarSpecification.display();
    }
}