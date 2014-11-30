package pl.dmichalski.lambda.c07_Supplier_functional_interface.vehicle;

/**
 * Author: Daniel
 */
public class Truck implements Vehicle {

    @Override
    public void operate() {
        System.out.println("Truck.operate() method invoked...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
