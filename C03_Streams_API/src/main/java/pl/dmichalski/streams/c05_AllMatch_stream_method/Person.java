package pl.dmichalski.streams.c05_AllMatch_stream_method;

/**
 * Author: Daniel
 */
public class Person {

    private String name;

    private String country;

    private Integer age;

    private Integer weight;

    public Person(String name, String country, Integer age, Integer weight) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", age=").append(age);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
