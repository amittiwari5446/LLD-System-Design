package specification;

import specification.CarSpecification;

// Concrete Product for North America Car Specification
public class NorthAmericaCarSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}
