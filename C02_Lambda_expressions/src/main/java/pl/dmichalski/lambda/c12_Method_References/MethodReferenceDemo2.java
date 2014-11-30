package pl.dmichalski.lambda.c12_Method_References;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Reference  to a constructor ==> ClassName::new <br/>
 * Author: Daniel
 */
public class MethodReferenceDemo2 {

    public static void main(String[] args) {
        List<Integer> integerNumbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Double> doubleNumbers = MethodReferenceDemo2.applyFunction(integerNumbers, x -> (double) x);
        List<Double> doubleNumbers = MethodReferenceDemo2.applyFunction(integerNumbers, Double::new);
        System.out.println("doubleNumbers = " + doubleNumbers);
    }

    public static List<Double> applyFunction(List<Integer> list, Function<Integer, Double> function) {
        List<Double> returnList = new ArrayList<>();
        list.forEach(x -> returnList.add(function.apply(x)));
        return returnList;
    }

}
