package pl.dmichalski.streams.c06_NoneMatch_anyMatch_stream_methods;

/**
 * Author: Daniel
 */
public class Person {

    private String name;

    private String country;

    private Integer age;

    public Person(String name, String country, Integer age) {
        this.name = name;
        this.country = country;
        this.age = age;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
