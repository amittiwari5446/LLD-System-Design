import builder.GamingComputerBuilder;
import director.ComputerDirector;
import product.Computer;

//client class
public class Main {
    public static void main(String[] args) {
        GamingComputerBuilder gamingComputerBuilder=new GamingComputerBuilder();
        ComputerDirector computerDirector=new ComputerDirector();
        computerDirector.construct(gamingComputerBuilder);

        Computer gamingComputer=gamingComputerBuilder.getResult();
        gamingComputer.displayInfo();
    }
}