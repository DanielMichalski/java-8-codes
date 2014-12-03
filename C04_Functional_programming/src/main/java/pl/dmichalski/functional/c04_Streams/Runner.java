package pl.dmichalski.functional.c04_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        List<Person> people = populateList();
        Optional<Person> personWithMinAge = getPersonWithMinAge(new ArrayList<>());
        System.out.println(personWithMinAge);

    }

    private static List<Person> populateList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Person1", 22));
        people.add(new Person("Person2", 45));
        people.add(new Person("Person3", 30));
        people.add(new Person("Person4", 27));
        people.add(new Person("Person5", 53));
        return people;
    }

    private static Optional<Person> getPersonWithMinAge(List<Person> people) {
        return people.stream()
                .min((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
    }

}
