package org.object_orientedVersusFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class PrintEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 63));
        employees.add(new Employee("Sally Smith", 29));
        employees.add(new Employee("Bob Jone", 36));
        employees.add(new Employee("Margaret Foster", 53));
        EmployeeService.printEmployeeImperative(employees, 50);
        System.out.println();
        EmployeeService.printEmployeeDeclarative(employees, 50);
    }
}
