package pl.dmichalski.streams.c03_GoupingBy_PartitioningBy_Counting;

/**
 * Author: Daniel
 */
public class Person {

    private String name;

    private String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return getName();
    }
}
