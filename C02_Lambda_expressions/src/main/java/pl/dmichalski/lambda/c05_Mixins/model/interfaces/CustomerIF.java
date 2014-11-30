package pl.dmichalski.lambda.c05_Mixins.model.interfaces;

/**
 * Author: Daniel
 */
public interface CustomerIF {

    default void buySomething() {
        System.out.println("Customer bought something...");
    }

}
