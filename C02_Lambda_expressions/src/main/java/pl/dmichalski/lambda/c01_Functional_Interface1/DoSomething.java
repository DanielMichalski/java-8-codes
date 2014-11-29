package pl.dmichalski.lambda.c01_Functional_Interface1;

import pl.dmichalski.lambda.c01_Functional_Interface1.interfaces.DoSomethingIF;
import pl.dmichalski.lambda.c01_Functional_Interface1.interfaces.DoSomethingIF2;

/**
 * Author: Daniel
 */
public class DoSomething implements DoSomethingIF, DoSomethingIF2 {

    public static void main(String[] args) {
        DoSomethingIF doSomething = new DoSomething();
        doSomething.doSomething();
        doSomething.doSomeOtherThing();
    }

    @Override
    public void doSomething() {
        System.out.println("doSomething()");
    }

    @Override
    public void doSomeOtherThing() {
        System.out.println("DoSomething.doSomeOtherThing()");
    }

}
