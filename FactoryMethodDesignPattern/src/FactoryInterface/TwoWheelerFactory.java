package FactoryInterface;

import LibraryClass.TwoWheeler;
import LibraryClass.Vehicle;

//concrete factory for two wheeler
public class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
