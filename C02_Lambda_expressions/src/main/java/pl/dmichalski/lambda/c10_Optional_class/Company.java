package pl.dmichalski.lambda.c10_Optional_class;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class Company {

    private List<Department> departments = new ArrayList<>();

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

}
