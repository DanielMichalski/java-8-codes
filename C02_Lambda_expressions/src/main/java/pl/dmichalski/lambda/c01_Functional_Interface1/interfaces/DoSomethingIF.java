package pl.dmichalski.lambda.c01_Functional_Interface1.interfaces;

/**
 * Author: Daniel
 */
@FunctionalInterface
public interface DoSomethingIF {

    void doSomething();

    public int hashCode();

    public boolean equals(Object obj);

    default void doSomeOtherThing() {
        System.out.println("DoSomethingIF.doSomeOtherThing()");
    }

}
