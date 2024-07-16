package FactoryInterface;

import LibraryClass.Vehicle;

//factory interface
public interface VehicleFactory {
    Vehicle createVehicle(String type);
}
