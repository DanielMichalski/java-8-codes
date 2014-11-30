package pl.dmichalski.lambda.c07_Supplier_functional_interface.vehicle;

/**
 * Author: Daniel
 */
public class SUV implements Vehicle {

    @Override
    public void operate() {
        System.out.println("SUV.operate() method invoked...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
