package Product;

// Concrete Product for Sedan Car
public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling sedan car...");
    }
}
