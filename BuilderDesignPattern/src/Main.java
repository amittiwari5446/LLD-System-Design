import builder.GamingComputerBuilder;
import builder.ProfessionalComputerBuilder;
import director.ComputerDirector;
import product.Computer;

//client class
public class Main {
    public static void main(String[] args) {
        ComputerDirector computerDirector=new ComputerDirector();

        GamingComputerBuilder gamingComputerBuilder=new GamingComputerBuilder();
        computerDirector.construct(gamingComputerBuilder);
        Computer gamingComputer=gamingComputerBuilder.getResult();
        gamingComputer.displayInfo();

        ProfessionalComputerBuilder professionalComputerBuilder=new ProfessionalComputerBuilder();
        computerDirector.construct(professionalComputerBuilder);
        Computer professionalComputer=professionalComputerBuilder.getResult();
        professionalComputer.displayInfo();
    }
}