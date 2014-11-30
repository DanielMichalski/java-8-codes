package pl.dmichalski.lambda.c12_Method_References;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Reference to a static method ==> ContainingClass::staticMethodName <br/>
 * Author: Daniel
 */
public class MethodReferenceDemo1 {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> evenNumberList = MethodReferenceDemo1.testPredicate(numberList, x -> isEvenNumber(x));
        List<Integer> evenNumberList = MethodReferenceDemo1.testPredicate(numberList, MethodReferenceDemo1::isEvenNumber);
        System.out.println("evenNumberList = " + evenNumberList);
    }

    public static boolean isEvenNumber(Integer x) {
        return (x & 1) == 0;
    }

    public static List<Integer> testPredicate(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> returnList = new ArrayList<>();
        list.forEach(x -> {
            if (predicate.test(x)) returnList.add(x);
        });
        return returnList;
    }

}
