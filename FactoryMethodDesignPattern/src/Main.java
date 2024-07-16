import ClientPackage.Client;
import FactoryInterface.FourWheelerFactory;
import FactoryInterface.TwoWheelerFactory;
import FactoryInterface.VehicleFactory;
import LibraryClass.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory= new TwoWheelerFactory();
        Client twoWheelerClient=new Client(twoWheelerFactory,"one");
        Vehicle twoWheeler=twoWheelerClient.getpVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory= new FourWheelerFactory();
        Client fourWheelerClient=new Client(fourWheelerFactory,"two");
        Vehicle fourWheeler=fourWheelerClient.getpVehicle();
        fourWheeler.printVehicle();
    }
}