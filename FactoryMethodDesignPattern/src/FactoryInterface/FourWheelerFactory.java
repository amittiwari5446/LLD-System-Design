package FactoryInterface;

import LibraryClass.FourWheeler;
import LibraryClass.Vehicle;

//concrete factory for four wheeler
public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
