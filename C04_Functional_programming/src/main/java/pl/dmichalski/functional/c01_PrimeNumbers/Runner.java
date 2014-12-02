package pl.dmichalski.functional.c01_PrimeNumbers;

import java.util.stream.IntStream;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        System.out.println(isPrime1(1));
        System.out.println(isPrime1(2));
        System.out.println(isPrime1(3));
        System.out.println(isPrime1(4));
    }

    /**
     * Imperative - saying how
     * mutability
     */
    private static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }

    /**
     * Declarative
     * what
     * Immutability
     */
    private static boolean isPrime2(int number) {
        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(x -> number % x == 0);
    }

}
