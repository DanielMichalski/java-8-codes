package pl.dmichalski.streams.c01_Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Author: Daniel
 */
public class Runner {

    private static List<String> list = populateList();

    private static Map<String, String> map = populateMap();

    public static void main(String[] args) {
        System.out.println("--------------- collections -----------------------------------------------");
        System.out.println("list: " + list);
        System.out.println("map: " + map);

        System.out.println("--------------- obtain Stream from List -----------------------------------");
        list.stream().forEach(System.out::println);
        System.out.println("--------------- obtain Stream from Map using entrySet() -------------------");
        map.entrySet().stream().forEach(System.out::println);
        System.out.println("--------------- obtain Stream from Map using keySet() ---------------------");
        map.keySet().stream().forEach(System.out::println);
        System.out.println("--------------- obtain Stream from Map using values() ---------------------");
        map.values().stream().forEach(System.out::println);
        System.out.println("--------------- obtain a stream from a String using chars() ---------------");
        "123456abcdefg".chars().forEach(x -> System.out.println(Character.toChars(x)));
        System.out.println("--------------- obtain a stream from a String using split() ---------------");
        Stream.of("A,B,C,D".split(",")).forEach(System.out::println);
        System.out.println("--------------- obtain Stream from array ----------------------------------");
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream.of(array).forEach(System.out::println);
        System.out.println("--------------- obtain Stream of values -----------------------------------");
        Stream.of("one", "two", "three").forEach(System.out::println);
        System.out.println("--------------- obtain a stream from function generate --------------------");
        Stream.generate(Math::random).limit(20).forEach(System.out::println);
        System.out.println("--------------- obtain a stream from function iterate ---------------------");
        Stream.iterate(0, i -> i + 1).limit(30).forEach(System.out::println);
        System.out.println("--------------- obtain Stream from Builder --------------------------------");
        Stream.builder().add("one").add("two").add("three").build().forEach(System.out::println);
        System.out.println("--------------- obtain a stream from another stream -----------------------");
        list.stream().distinct().limit(2).sorted().forEach(System.out::println);
    }

    private static List<String> populateList() {
        List<String> list = new ArrayList<>();
        list.add("listval1");
        list.add("listval2");
        list.add("listval3");
        list.add("listval1");
        list.add("listval2");
        list.add("listval4");
        return list;
    }

    private static Map<String, String> populateMap() {
        Map<String, String> map = new HashMap<>();
        map.put("mapkey1", "mapval1");
        map.put("mapkey2", "mapval2");
        map.put("mapkey3", "mapval3");
        return map;
    }

}
