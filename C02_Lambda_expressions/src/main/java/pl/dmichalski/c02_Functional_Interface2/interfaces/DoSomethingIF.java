package pl.dmichalski.c02_Functional_Interface2.interfaces;

/**
 * Author: Daniel
 */
@FunctionalInterface
public interface DoSomethingIF {

    void doSomething();

    public int hashCode();

    // It's not possible
    // public default boolean equals(Object obj) {}

    default void doSomeOtherThing() {
        System.out.println("DoSomethingIF.doSomeOtherThing()");
    }

    static void doSomeStatic() {
        System.out.println("DoSomethingIF.doSomeStatic()");
    }

}
