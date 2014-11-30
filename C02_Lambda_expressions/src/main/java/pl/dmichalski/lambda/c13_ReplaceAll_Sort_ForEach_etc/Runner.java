package pl.dmichalski.lambda.c13_ReplaceAll_Sort_ForEach_etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("1 - Original list of integers: " + integerList);

        //---------------------------- replaceAll ----------------------------
        integerList.replaceAll(x -> x * 5);
        System.out.println("2 - Multiply all Integers by 5 (replaceAll method): " + integerList);

        //---------------------------- compareTo ----------------------------
        integerList.sort((x, y) -> y.compareTo(x));
        System.out.println("3 - Sort Integers in descending order(sort method): " + integerList);

        //----------------------------- forEach -----------------------------
        List<Double> doubleList = new ArrayList<>();
        Function<Integer, Double> function = Integer::doubleValue;
        integerList.forEach(x -> doubleList.add(function.apply(x)));
        System.out.println("4 - Turn Integers into Doubles (forEach method): " + doubleList);

        //---------------------------- replaceAll ----------------------------
        doubleList.removeIf(x -> x > 20);
        System.out.println("5 - Remove all Doubles > 20 (removeIf method): " + doubleList);
    }

}
