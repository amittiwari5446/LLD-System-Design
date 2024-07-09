package Factory;

import Product.Car;
import specification.CarSpecification;

// Abstract Factory Interface
public interface CarFactory {
    Car createCar();
    CarSpecification createCarSpecification();
}
