package org.employee;

import java.util.List;
import java.util.Scanner;

public interface EmployeeService {

    void registerEmployee(Scanner input, String employeeFile);
    void checkIfEmployeeExist(Scanner input, String employeeFile);
    Employee getEmployeeByName(String name, String employeeFile);
    List<Employee> getEmployees(String employeeFile);
    Employee getEmployee(String[] arr);
}
