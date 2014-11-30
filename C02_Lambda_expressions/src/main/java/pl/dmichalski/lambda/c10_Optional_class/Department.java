package pl.dmichalski.lambda.c10_Optional_class;

import java.util.Optional;

/**
 * Author: Daniel
 */
public class Department {

    private String name;

    private Optional<Manager> manager = Optional.empty();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Manager> getManager() {
        return manager;
    }

    public void setManager(Optional<Manager> manager) {
        this.manager = manager;
    }
}
