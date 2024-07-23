package implementer;

public class Assemble implements Workshop{
    @Override
    public void work() {
        System.out.print(" and ");
        System.out.println("Assembled");
    }
}
