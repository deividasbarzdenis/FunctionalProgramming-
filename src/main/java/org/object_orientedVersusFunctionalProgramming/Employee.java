package org.object_orientedVersusFunctionalProgramming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + ": " + age;
    }
}
