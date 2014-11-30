package pl.dmichalski.lambda.c07_Supplier_functional_interface.vehicle;

/**
 * Author: Daniel
 */
public class Car implements Vehicle {

    @Override
    public void operate() {
        System.out.println("Car.operate() method invoked...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
