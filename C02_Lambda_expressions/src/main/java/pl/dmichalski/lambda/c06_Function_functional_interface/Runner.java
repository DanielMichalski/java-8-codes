package pl.dmichalski.lambda.c06_Function_functional_interface;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

        FunctionDemo<Integer, Double> functionDemo1 = new FunctionDemo<>();
        System.out.println("x ===========================> " + list);
        System.out.println("x as Double =================> " + functionDemo1.applyFunction(x -> (double) x, list));
        System.out.println("x*0.5 =======================> " + functionDemo1.applyFunction(x -> ((double) x) * 0.5, list));
        System.out.println("andThen ==> (x + x)(x + x) ==> " + functionDemo1.applyFunctionAndThen(x -> (double) x + (double) x, x -> x * x, list));
        System.out.println("compose ==> (x + x)(x + x) ==> " + functionDemo1.applyFunctionCompose(x -> x + x, x -> (double) x * (double) x, list));

        System.out.println("----------------------------------------------------------------------");

        FunctionDemo<Integer, Float> functionDemo2 = new FunctionDemo<>();
        System.out.println("x ===========================> " + list);
        System.out.println("x as Float ==================> " + functionDemo2.applyFunction(x -> (float) x, list));
        System.out.println("x*0.5 =======================> " + functionDemo2.applyFunction(x -> new Float(x * 0.5), list));
        System.out.println("andThen ==> (x + x)(x + x) ==> " + functionDemo2.applyFunctionAndThen(x -> (float) x + (float) x, x -> x * x, list));
        System.out.println("compose ==> (x + x)(x + x) ==> " + functionDemo2.applyFunctionCompose(x -> x + x, x -> (float) x * (float) x, list));
    }

}
