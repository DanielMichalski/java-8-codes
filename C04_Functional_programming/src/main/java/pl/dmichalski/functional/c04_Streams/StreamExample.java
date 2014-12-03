package pl.dmichalski.functional.c04_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Daniel
 */
public class StreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Joe", "James", "Philip");

        List<Integer> result = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("result = " + result);
    }

}
