package pl.dmichalski.lambda.c11_Variable_scoping;

import java.util.function.Consumer;

/**
 * It shows us what we are able to do with lambda
 * and what we don't <br />
 * Author: Daniel
 */
public class VariableScopingDemo {

    private int instanceVar1 = 3;

    private int x = 6;

    public static void main(String[] args) {
        VariableScopingDemo variableScopingDemo = new VariableScopingDemo();
        variableScopingDemo.doSomething();
    }


    private void doSomething() {
        int localVar1 = 1;
        // String x = "xvalue";
        Consumer<String> consumer = x -> {
            // int localVar1 = 2;
            // localVar1 = 2;
            instanceVar1 = 4;
            System.out.println("x:" + x);
        };
        consumer.accept("anxvalue");
        System.out.println("instanceVar1 = " + instanceVar1);
    }

}
