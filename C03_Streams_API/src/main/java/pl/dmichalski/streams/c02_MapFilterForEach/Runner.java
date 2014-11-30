package pl.dmichalski.streams.c02_MapFilterForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        List<Person> persons = populatePersons();
        System.out.println("---------- Ids of all persons form the US (using filter + map + forEach methods) ------------");
        persons.stream()
                .filter(x -> x.getCountry().equals("US"))
                .forEach(System.out::println);
        System.out.println("---------- Ids of all persons not from the US (using filer + map + forEach methods) ---------");
        persons.stream()
                .filter(x -> !x.getCountry().equals("US"))
                .forEach(System.out::println);
        System.out.println("---------- Using <A> A[] toArray(IntFunction<A[]> generator) method -------------------------");
        Person[] personsArray = persons.stream().toArray(Person[]::new);
        Arrays.asList(personsArray).forEach(person -> System.out.println(person.getId()));
        System.out.println("---------- using Object[] toArray() method --------------------------------------------------");
        Object[] objectArray = persons.stream().toArray();
        Arrays.asList(objectArray).forEach(object -> System.out.println(((Person) object).getId()));
    }

    private static List<Person> populatePersons() {
        Person person1 = new Person("person1", "US");
        Person person2 = new Person("person2", "Mexico");
        Person person3 = new Person("person3", "Canada");
        Person person4 = new Person("person4", "US");
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        return list;
    }

}
