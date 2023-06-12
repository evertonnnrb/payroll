package br.com.payroll.service;

import br.com.payroll.entities.FinancialWorker;

public class FinancialWorkerService implements PayRollService{
    private FinancialWorker financialWorker;
    @Override
    public double baseSalary() {
        return financialWorker.getBaseSalary() / 12 * 1;
    }
    @Override
    public double grossSalary() {
        return financialWorker.getHoursWorked() * baseSalary();
    }
    @Override
    public double taxSalary() {
        double tax;
        if (grossSalary() > 1800.0 && grossSalary() < 2000.0) {
            tax = 0.11;
        } else if (grossSalary() >= 2000.0 && grossSalary() < 2459.0) {
            tax = 0.13;
        } else {
            tax = 0.15;
        }
        return tax;
    }
    @Override
    public double bonus() {
        return financialWorker.getHoursWorked() > 120 ? 300.0 : 0;
    }
    @Override
    public double extraBonus() {
        return financialWorker.getPerson().getNumberOfChildren() > 0 ? financialWorker.getBaseSalary() * 1 : 0.0;
    }
    @Override
    public double netSalary() {
        return (grossSalary() - taxSalary()) + (bonus() + extraBonus());
    }
}
