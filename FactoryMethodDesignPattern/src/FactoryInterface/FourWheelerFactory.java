package FactoryInterface;

import LibraryClass.FourWheeler;
import LibraryClass.FourWheeler2;
import LibraryClass.TwoWheeler2;
import LibraryClass.Vehicle;

//concrete factory for four wheeler
public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String type) {
        if (type.equals("one")){
            return new FourWheeler();
        }
        else if (type.equals("two")) {
            return new FourWheeler2();
        }
        else return null;
    }
}
