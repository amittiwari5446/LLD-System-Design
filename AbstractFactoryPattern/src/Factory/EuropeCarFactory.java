package Factory;

import Product.Car;
import specification.CarSpecification;
import specification.EuropeCarSpecification;
import Product.Hatchback;

// Concrete Factory for Europe Cars
public class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new EuropeCarSpecification();
    }
}
