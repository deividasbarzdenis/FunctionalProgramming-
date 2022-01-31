package org.object_orientedVersusFunctionalProgramming;

import java.util.List;

public class EmployeeService {

    /**
     * method reveals the imperative, statement-oriented approach. As specified, this method iterates over
     * a list of employees, compares each employee's age against an argument value, and
     * (if the age is less than the argument), prints the employee's details.
     * */
    public static void printEmployeeImperative(List<Employee> employees, int age){
        for(Employee emp : employees){
            if(emp.getAge() < age){
                System.out.println(emp);
            }
        }
    }

    /**
     * method reveals the declarative, expression-oriented approach, in this case implemented with the Streams API.
     * Instead of imperatively specifying how to print the employees (step-by-step), the expression specifies
     * the desired outcome and leaves the details of how to do it to Java. Think of filter() as the functional
     * equivalent of an if statement, and forEach() as functionally equivalent to the for statement.
     * */
    public static void printEmployeeDeclarative(List<Employee> employees, int age){
        employees.stream()
                .filter(employee -> employee.getAge() < age)
                .forEach(employee -> System.out.println(employee));
    }
}
