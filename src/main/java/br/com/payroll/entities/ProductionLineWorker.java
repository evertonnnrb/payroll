package br.com.payroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class ProductionLineWorker extends Employee{
    private double additonalHealth;

    public ProductionLineWorker(){}
    public ProductionLineWorker(Person person, Character shift, Integer hoursWorked, double baseSalary, double additonalHealth) {
        this.additonalHealth = additonalHealth;
    }

    public double getAdditonalHealth() {
        return additonalHealth;
    }

    public void setAdditonalHealth(double additonalHealth) {
        this.additonalHealth = additonalHealth;
    }

    @Override
    public String toString() {
        return "ProductionLineWorker{" +
                "additonalHealth=" + additonalHealth +
                '}';
    }
}
