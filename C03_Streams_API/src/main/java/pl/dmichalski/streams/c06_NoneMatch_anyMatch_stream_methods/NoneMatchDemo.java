package pl.dmichalski.streams.c06_NoneMatch_anyMatch_stream_methods;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class NoneMatchDemo {

    private static int i = 0, j = 0;

    public static void main(String[] args) {
        List<Person> persons = populateWithData();
        persons.stream().forEach(System.out::println);
        System.out.println("\nNoneMatch returns whether of this stream match provided predicate");
        System.out.println("noneMatch returned: " + persons.stream()
                .filter(p -> {
                    boolean flag = p.getAge() > 25;
                    System.out.println("[age>25 filter] pass # " + (i++) + " returns: " + flag);
                    return flag;
                })
                .noneMatch(p -> {
                    boolean flag = p.getCountry().equals("US");
                    System.out.println("[noneMatch - Country='US'] pass # " + (j++) + " returns: " + flag);
                    return flag;
                }));
    }

    private static List<Person> populateWithData() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("person1", "US", 20));
        list.add(new Person("person2", "Mexico", 25));
        list.add(new Person("person3", "US", 26));
        list.add(new Person("person4", "Canada", 29));
        list.add(new Person("person5", "US", 30));
        return list;
    }

}
