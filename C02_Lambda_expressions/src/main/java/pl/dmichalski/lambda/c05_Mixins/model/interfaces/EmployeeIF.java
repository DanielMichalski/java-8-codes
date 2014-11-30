package pl.dmichalski.lambda.c05_Mixins.model.interfaces;

/**
 * Author: Daniel
 */
public interface EmployeeIF {

    default void signIn() {
        System.out.println("Employee signed in...");
    }

    default void signOut() {
        System.out.println("Employee signed out...");
    }

}
