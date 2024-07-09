package specification;

import specification.CarSpecification;

// Concrete Product for Europe Car Specification
public class EuropeCarSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Safety features compliant with local regulations.");
    }
}
