package pl.dmichalski.lambda.c08_UnaryOperator_functional_interface;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
        List<Double> list2 = Arrays.asList(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0);

        UnaryOperatorDemo<Integer> unaryOperatorDemo1 = new UnaryOperatorDemo<>();
        UnaryOperatorDemo<Double> unaryOperatorDemo2 = new UnaryOperatorDemo<>();

        System.out.println("x ========================> " + unaryOperatorDemo1.applyFunction(x -> x, list1));
        System.out.println("x*5 ======================> " + unaryOperatorDemo1.applyFunction(x -> x * 5, list1));
        System.out.println("andThen ==> (x+x)(x+x) ===> " + unaryOperatorDemo1.applyFunctionAndThen(x -> x + x, x -> x * x, list1));
        System.out.println("compose ==> (x*x)+(x*x) ==> " + unaryOperatorDemo1.applyFunctionCompose(x -> x + x, x -> x * x, list1));

        System.out.println("-----------------------------------------------------");

        System.out.println("x =========> " + unaryOperatorDemo2.applyFunction(x -> x, list2));
        System.out.println("x*0.5 =======> " + unaryOperatorDemo2.applyFunction(x -> x * 0.5, list2));
    }

}
