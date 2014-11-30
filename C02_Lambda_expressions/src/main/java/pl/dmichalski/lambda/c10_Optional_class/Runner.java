package pl.dmichalski.lambda.c10_Optional_class;

import java.util.Optional;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        Company company = generateData();

        company.getDepartments().forEach(dept -> {
            if (dept.getManager().isPresent()) {
                System.out.println(dept.getName() + ", Manager: " + dept.getManager().get().getName());
            } else {
                System.out.println(dept.getName() + ", Manager: N/A");
            }
        });
    }

    private static Company generateData() {
        Company company = new Company();

        Department department1 = new Department("Accounting");
        Manager manager1 = new Manager("Jane Doe");
        department1.setManager(Optional.of(manager1));
        company.addDepartment(department1);

        Department department2 = new Department("Development");
        Manager manager2 = new Manager("Jane Doe");
        department2.setManager(Optional.of(manager2));
        company.addDepartment(department2);

        Department department3 = new Department("Research");
        company.addDepartment(department3);

        return company;
    }

}
