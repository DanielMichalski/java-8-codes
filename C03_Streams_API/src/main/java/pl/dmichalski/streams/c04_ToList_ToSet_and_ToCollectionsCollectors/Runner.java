package pl.dmichalski.streams.c04_ToList_ToSet_and_ToCollectionsCollectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        List<Person> persons = populateWithData();

        System.out.println("---- Use Collectors.toList() in order to obtain the List of US based persons -----------------------------");
        List<Person> listOfPersons = persons.stream().filter(p -> p.getCountry().equals("US")).collect(Collectors.toList());
        System.out.println(listOfPersons);
        Map<String, List<Person>> mapOfList = persons.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.toList()));
        System.out.println(mapOfList.get("US"));
        System.out.println("---- Use Collectors.toSet() in order to obtain the Set of US based persons -------------------------------");
        Set<Person> personSet = persons.stream().filter(p -> p.getCountry().equals("US")).collect(Collectors.toSet());
        System.out.println(personSet);
        System.out.println("---- Use Collectors.toCollection(ArrayList::new) in order to obtain the ArrayList of US based persons ----");
        List<Person> personList = persons.stream().filter(p -> p.getCountry().equals("US")).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(personList);
        System.out.println("---- Use Collectors.toCollection(Vector::new) in order to obtain the Vector of US based persons ----------");
        Vector<Person> vector = persons.stream().filter(p -> p.getCountry().equals("US")).collect(Collectors.toCollection(Vector::new));
        System.out.println(vector);
        System.out.println("---- Use Collectors.toCollection(Stack::new) in order to obtain the Stack of US based persons ------------");
        Stack stack = persons.stream().filter(p -> p.getCountry().equals("US")).collect(Collectors.toCollection(Stack::new));
        System.out.println(stack);
        System.out.println("---- Use Collectors.toCollection(HashSet::new) in order to obtain the HashSet of US based persons -------- ");
        HashSet<Person> hashset = persons.stream().filter(p -> p.getCountry().equals("US")).collect(Collectors.toCollection(HashSet::new));
        System.out.println(hashset);
    }

    private static List<Person> populateWithData() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("JohnA", "US"));
        personList.add(new Person("JohnB", "US"));
        personList.add(new Person("JohnC", "Canada"));
        personList.add(new Person("JohnD", "US"));
        personList.add(new Person("JohnE", "Canada"));
        personList.add(new Person("JohnF", "US"));
        personList.add(new Person("JohnA", "US"));
        personList.add(new Person("JohnE", "Canada"));
        return personList;
    }

}
