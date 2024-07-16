package ClientPackage;

import FactoryInterface.VehicleFactory;
import LibraryClass.Vehicle;

public class Client {
    private Vehicle pVehicle;

    public Client(VehicleFactory vehicleFactory,String type){
        pVehicle=vehicleFactory.createVehicle(type);
    }
    public Vehicle getpVehicle(){
        return pVehicle;
    }
}
