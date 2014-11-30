package pl.dmichalski.lambda.c07_Supplier_functional_interface.shape;

/**
 * Author: Daniel
 */
public class Rectangle implements Shape {

    @Override
    public void sketch() {
        System.out.println("Rectangle.sketch() method invoked...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
