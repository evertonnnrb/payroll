package br.com.payroll.entities;

import java.util.Objects;

public abstract class Employee {
    private Integer id;
    private Person person;
    private Character shift;
    private Integer hoursWorked;
    private double baseSalary;

    public Employee() {
    }

    public Employee(Person person, Character shift, Integer hoursWorked, double baseSalary) {
        this.person = person;
        this.shift = shift;
        this.hoursWorked = hoursWorked;
        this.baseSalary = baseSalary;
    }

    public Employee(Integer id, Person person, Character shift, Integer hoursWorked, double baseSalary) {
        this.id = id;
        this.person = person;
        this.shift = shift;
        this.hoursWorked = hoursWorked;
        this.baseSalary = baseSalary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Character getShift() {
        return shift;
    }

    public void setShift(Character shift) {
        this.shift = shift;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee : " + person.getName() + " email : " + person.getEmail() + " has children(s)? "
                + person.getNumberOfChildren()
                + "\nid=" + id + "\nperson=" + person + "\nshift : " + shift + "base salary " + String.format("R$ %.2f", baseSalary);
    }

    public String showData() {
        return "Employee : " + person.getName() + " email : " + person.getEmail() + " has children(s)? "
                + person.getNumberOfChildren()
                + "\nid=" + id + "\nperson=" + person + "\nshift : " + shift + "base salary " + String.format("R$ %.2f", baseSalary);
    }
}
