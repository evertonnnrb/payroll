package br.com.payroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private String email;
    private Integer numberOfChildren;
    @Override
    public String toString() {
        return "Person" + name + ", email='" + email + ", numberOfChildren=" + numberOfChildren;
    }
}
