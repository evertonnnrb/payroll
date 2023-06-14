package br.com.payroll.service;

import br.com.payroll.entities.FinancialWorker;

public class FinancialWorkerService implements PayRollService {
    private FinancialWorker financialWorker;

    public FinancialWorkerService(FinancialWorker financialWorker) {
        this.financialWorker = financialWorker;
    }

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
        if (grossSalary() > 1200.0 && grossSalary() < 2000.0) {
            tax = 0.1;
        }else {
            tax = 0.3;
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
