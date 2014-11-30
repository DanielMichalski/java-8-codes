package pl.dmichalski.lambda.c04_Predicate_functional_interface;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight");
        List<Object> objectList = Arrays.asList(new String("one"), new String("two"), new String("three"));

        PredicateDemo<Integer> predicateDemo1 = new PredicateDemo<>();
        PredicateDemo<String> predicateDemo2 = new PredicateDemo<>();
        PredicateDemo<Object> predicateDemo3 = new PredicateDemo<>();

        System.out.println("All: " + predicateDemo1.testPredicate(x -> true, integerList));
        System.out.println("Even: " + predicateDemo1.testPredicate(x -> (x & 1) == 0, integerList));
        System.out.println("Odd: " + predicateDemo1.testPredicate(x -> (x & 1) == 1, integerList));

        System.out.println("-----------------------------------------------------------------");

        System.out.println("All strings: " + predicateDemo2.testPredicate(x -> true, stringList));
        System.out.println("Contains ee: " + predicateDemo2.testPredicate(x -> x.contains("ee"), stringList));
        System.out.println("Contains t: " + predicateDemo2.testPredicate(x -> x.contains("t"), stringList));

        System.out.println("-----------------------------------------------------------------");

        System.out.println("All objects: " + predicateDemo3.testPredicate(x -> true, objectList));
        System.out.println("Instance of String: " + predicateDemo3.testPredicate(x -> x instanceof String, objectList));
        System.out.println("Instance of StringBuilder: " + predicateDemo3.testPredicate(x -> x instanceof StringBuilder, objectList));

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Negate all: " + predicateDemo1.testPredicateNEGATE(x -> true, integerList));
        System.out.println("Negate Even: " + predicateDemo1.testPredicateNEGATE(x -> (x & 1) == 0, integerList));
        System.out.println("Negate odd: " + predicateDemo1.testPredicateNEGATE(x -> (x & 1) == 1, integerList));

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Even or odd #s: " + predicateDemo1.testPredicateOR(x -> (x & 1) == 0, x -> (x & 1) == 1, integerList));
        System.out.println("Even and odd #s: " + predicateDemo1.testPredicateAND(x -> (x & 1) == 0, x -> (x & 1) == 1, integerList));
    }

}
