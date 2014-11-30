package pl.dmichalski.lambda.c07_Supplier_functional_interface;

import pl.dmichalski.lambda.c07_Supplier_functional_interface.factory.Factory;
import pl.dmichalski.lambda.c07_Supplier_functional_interface.shape.Circle;
import pl.dmichalski.lambda.c07_Supplier_functional_interface.shape.Rectangle;
import pl.dmichalski.lambda.c07_Supplier_functional_interface.shape.Shape;
import pl.dmichalski.lambda.c07_Supplier_functional_interface.shape.Triangle;
import pl.dmichalski.lambda.c07_Supplier_functional_interface.vehicle.Car;
import pl.dmichalski.lambda.c07_Supplier_functional_interface.vehicle.SUV;
import pl.dmichalski.lambda.c07_Supplier_functional_interface.vehicle.Truck;
import pl.dmichalski.lambda.c07_Supplier_functional_interface.vehicle.Vehicle;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        Factory<Shape> factory = new Factory<>();
        Factory<Vehicle> factory2 = new Factory<>();

        Shape circle = factory.getX(() -> new Circle());
        Shape rectangle = factory.getX(Rectangle::new);
        Shape triangle = factory.getX(Triangle::new);

        Vehicle car = factory2.getX(Car::new);
        Vehicle suv = factory2.getX(SUV::new);
        Vehicle truck = factory2.getX(Truck::new);

        System.out.println(circle);
        circle.sketch();
        System.out.println("--------------------------------------");
        System.out.println(rectangle);
        rectangle.sketch();
        System.out.println("--------------------------------------");
        System.out.println(triangle);
        triangle.sketch();

        System.out.println("======================================");

        System.out.println(car);
        car.operate();
        System.out.println("--------------------------------------");
        System.out.println(suv);
        suv.operate();
        System.out.println("--------------------------------------");
        System.out.println(truck);
        truck.operate();
        System.out.println("--------------------------------------");
    }

}
