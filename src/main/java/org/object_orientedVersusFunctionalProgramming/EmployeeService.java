package org.object_orientedVersusFunctionalProgramming;

import java.util.List;

public class EmployeeService {
    public static void printEmployeeImperative(List<Employee> employees, int age){
        for(Employee emp : employees){
            if(emp.getAge() < age){
                System.out.println(emp);
            }
        }
    }
    public static void printEmployeeDeclarative(List<Employee> employees, int age){
        employees.stream()
                .filter(employee -> employee.getAge() < age)
                .forEach(employee -> System.out.println(employee));
    }
}
