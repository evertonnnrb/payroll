package br.com.payroll.service;

import br.com.payroll.entities.ProductionLineWorker;
public class ProductionLineWorkerService implements PayRollService{
    private ProductionLineWorker productionLineWorker;
    @Override
    public double baseSalary() {
        return productionLineWorker.getBaseSalary() / 12 * 1;
    }
    @Override
    public double grossSalary() {
        return productionLineWorker.getHoursWorked() * baseSalary();
    }
    @Override
    public double taxSalary() {
        double tax;
        if (grossSalary() > 1100.0 && grossSalary() < 1200.0) {
            tax = 0.03;
        } else if (grossSalary() >= 1200.0 && grossSalary() < 1800.0) {
            tax = 0.4;
        } else {
            tax = 0.5;
        }
        return tax;
    }
    @Override
    public double bonus() {
        return productionLineWorker.getHoursWorked() > 120 ? 300.0 : 0;
    }
    @Override
    public double extraBonus() {
        return productionLineWorker.getPerson().getNumberOfChildren() > 0 ? productionLineWorker.getBaseSalary() * 1 : 0.0;
    }

    @Override
    public double netSalary() {
        return (grossSalary() - taxSalary()) + (bonus() + extraBonus()) ;
    }
}
