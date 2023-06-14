package br.com.payroll.entities;

public class FinancialWorker extends Employee {
    private Double subisistenceAllowance;

    public FinancialWorker(){}
    public FinancialWorker(Person person, Character shift, Integer hoursWorked, double baseSalary, Double subisistenceAllowance) {
        super();
        this.subisistenceAllowance = subisistenceAllowance;
    }

    public Double getSubisistenceAllowance() {
        return subisistenceAllowance;
    }

    public void setSubisistenceAllowance(Double subisistenceAllowance) {
        this.subisistenceAllowance = subisistenceAllowance;
    }

    @Override
    public String toString() {
        return "\nSubistance allowance : "+String.format("R$ %.2f",subisistenceAllowance);
    }
}
