package pl.dmichalski.streams.c05_AllMatch_stream_method;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class AllMatchDemo1 {

    private static int i = 0;

    public static void main(String[] args) {
        List<Person> persons = populateWithData();
        persons.stream().forEach(System.out::println);
        System.out.println("\nallMatch: returns whether all elements of this stream match the provided predicate\"");
        System.out.println("allMatch returned " +
                persons.stream().allMatch(p -> {
                    boolean flag = p.getCountry().equals("US");
                    System.out.println("[allMatch - Country='US'] pass # " + (i++) + " | returns: " + flag);
                    return flag;
                }));
    }

    private static List<Person> populateWithData() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("person1", "US", 20, 87));
        list.add(new Person("person2", "Mexico", 25, 90));
        list.add(new Person("person3", "US", 26, 110));
        list.add(new Person("person4", "US", 29, 120));
        list.add(new Person("person5", "Canada", 30, 97));
        return list;
    }

}
