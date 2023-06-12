package br.com.payroll.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class Employee {
    @EqualsAndHashCode.Include
    private Integer id;
    private Person person;
    private Character shift;
    private Integer hoursWorked;
    private double baseSalary;
    public String showData() {
        return "Employee : " + person.getName() + " email : " + person.getEmail() + " has children(s)? "
                + person.getNumberOfChildren()
                + "\nid=" + id + "\nperson=" + person + "\nshift : " + shift + "base salary " + String.format("R$ %.2f", baseSalary);
    }
}
