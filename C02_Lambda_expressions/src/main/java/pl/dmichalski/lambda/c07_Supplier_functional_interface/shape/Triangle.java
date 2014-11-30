package pl.dmichalski.lambda.c07_Supplier_functional_interface.shape;

/**
 * Author: Daniel
 */
public class Triangle implements Shape {

    @Override
    public void sketch() {
        System.out.println("Triangle.sketch() method invoked...");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
