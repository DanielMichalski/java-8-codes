package pl.dmichalski.lambda.c01_Functional_Interface1.interfaces;

/**
 * Author: Daniel
 */
@FunctionalInterface
public interface DoSomethingIF2 {

    void doSomething();

    default void doSomeOtherThing() {
        System.out.println("DoSomethingIF2.doSomeOtherThing()");
    }

}
