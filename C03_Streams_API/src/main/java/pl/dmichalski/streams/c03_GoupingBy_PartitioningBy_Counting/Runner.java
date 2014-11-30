package pl.dmichalski.streams.c03_GoupingBy_PartitioningBy_Counting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        List<Person> persons = populateWithData();
        System.out.println("--- Obtain US and non US based persons using partitioningBy & groupingBy -----------------------------");
        System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US"))));
        System.out.println(persons.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry().equals("US"))));
        System.out.println("--- Count US and non US based persons using partitioningBy & groupingBy ------------------------------");
        System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US"), Collectors.counting())));
        System.out.println(persons.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry().equals("US"), Collectors.counting())));
        System.out.println("--- Obtain the persons in each country and count them using groupingBy -------------------------------");
        System.out.println(persons.stream().collect(Collectors.groupingBy(Person::getCountry)));
        System.out.println(persons.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.counting())));
        System.out.println("--- Obtain US and non US based persons using partitioningBy & map names to uppercase using mapping ---");
        System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US"), Collectors.mapping(t -> t.getName().toUpperCase(), Collectors.toList()))));
        System.out.println("--- Obtain persons in each country using groupingBy & map names to uppercase using mapping -----------");
        System.out.println(persons.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.mapping(t -> t.getName().toUpperCase(), Collectors.toList()))));
    }

    private static List<Person> populateWithData() {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("person1", "US"));
        personsList.add(new Person("person2", "US"));
        personsList.add(new Person("person3", "Brazil"));
        personsList.add(new Person("person4", "US"));
        personsList.add(new Person("person5", "Brazil"));
        personsList.add(new Person("person6", "US"));
        personsList.add(new Person("person7", "Germany"));
        personsList.add(new Person("person8", "US"));
        return personsList;
    }

}
