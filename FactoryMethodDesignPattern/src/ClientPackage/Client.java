package ClientPackage;

import FactoryInterface.VehicleFactory;
import LibraryClass.Vehicle;

public class Client {
    private Vehicle pVehicle;

    public Client(VehicleFactory vehicleFactory){
        pVehicle=vehicleFactory.createVehicle();
    }
    public Vehicle getpVehicle(){
        return pVehicle;
    }
}
