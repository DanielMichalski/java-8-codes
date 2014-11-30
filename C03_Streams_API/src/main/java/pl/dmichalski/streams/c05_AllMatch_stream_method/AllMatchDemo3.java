package pl.dmichalski.streams.c05_AllMatch_stream_method;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class AllMatchDemo3 {

    private static int i = 0, j = 0, k = 0;

    public static void main(String[] args) {
        List<Person> persons = populateWithData();
        persons.stream().forEach(System.out::println);
        System.out.println("\nallMatch: returns whether all elements of this stream match the provided predicate\"");
        System.out.println("allMatch returned " +
                persons.stream()
                        .filter(p -> {
                            boolean flag = p.getAge() > 25;
                            System.out.println("[filter 1 - age > 25] pass # " + (i++) + " | returns:" + flag);
                            return flag;
                        })
                        .filter(p -> {
                            boolean flag = p.getWeight() > 90;
                            System.out.println("[filter 2 - weight > 90] pass # " + (j++) + " | returns:" + flag);
                            return flag;
                        })
                        .allMatch(p -> {
                            boolean flag = p.getCountry().equals("US");
                            System.out.println("[allMatch - Country='US'] pass # " + (k++) + " | returns: " + flag);
                            return flag;
                        }));
    }

    private static List<Person> populateWithData() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("person1", "US", 20, 87));
        list.add(new Person("person2", "Mexico", 25, 90));
        list.add(new Person("person3", "US", 26, 110));
        list.add(new Person("person4", "Canada", 29, 120));
        list.add(new Person("person5", "US", 30, 97));
        return list;
    }

}