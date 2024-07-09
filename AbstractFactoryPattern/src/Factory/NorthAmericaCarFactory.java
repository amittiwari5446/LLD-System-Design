package Factory;

import Product.Car;
import specification.CarSpecification;
import specification.NorthAmericaCarSpecification;
import Product.Sedan;

// Concrete Factory for North America Cars
public class NorthAmericaCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new NorthAmericaCarSpecification();
    }
}
