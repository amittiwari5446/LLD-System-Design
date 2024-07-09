package Product;

// Concrete Product for Hatchback Car
public class Hatchback implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car...");
    }
}
