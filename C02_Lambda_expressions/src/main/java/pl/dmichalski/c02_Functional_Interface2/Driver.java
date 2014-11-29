package pl.dmichalski.c02_Functional_Interface2;

import pl.dmichalski.c01_Functional_Interface1.interfaces.DoSomethingIF;

/**
 * Author: Daniel
 */
public class Driver {

    public static void main(String[] args) {
        /*DoSomethingIF doSomethingAnonymousClass = new DoSomethingIF() {
            @Override
            public void doSomething() {
                System.out.println("doSomething invoked...");
            }
        };*/

        DoSomethingIF doSomethingAnonymousClass = () -> System.out.println("doSomething invoked...");
        doSomethingAnonymousClass.doSomething();
    }

}
