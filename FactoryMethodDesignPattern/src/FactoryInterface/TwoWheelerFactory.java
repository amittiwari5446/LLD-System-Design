package FactoryInterface;

import LibraryClass.TwoWheeler;
import LibraryClass.TwoWheeler2;
import LibraryClass.Vehicle;

//concrete factory for two wheeler
public class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String type) {
        if(type.equals("one")){
            return new TwoWheeler();
        }
        else if (type.equals("two")) {
            return new TwoWheeler2();
        }
        else return null;
    }
}
