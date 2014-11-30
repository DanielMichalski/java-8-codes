package pl.dmichalski.lambda.c07_Supplier_functional_interface.shape;

/**
 * Author: Daniel
 */
public class Circle implements Shape {

    @Override
    public void sketch() {
        System.out.println("Circle.sketch() method invoked...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
