package br.com.payroll.service;

import br.com.payroll.entities.SellerWorker;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class SellerWorkerService implements PayRollService {
    private SellerWorker employee;
    @Override
    public double baseSalary() {
        return employee.getBaseSalary() / 12 * 1;
    }
    @Override
    public double grossSalary() {
        return employee.getHoursWorked() * baseSalary();
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
        return employee.getHoursWorked() > 120 ? 300.0 : 0;
    }
    @Override
    public double extraBonus() {
        return employee.getPerson().getNumberOfChildren() > 0 ? employee.getBaseSalary() * 1 : 0.0;
    }
    public double calculateCommission() {
        return employee.getQuantitySoldMonth() * employee.getCommission();
    }
    @Override
    public double netSalary() {
        return (grossSalary() - taxSalary()) + (bonus() + extraBonus()) + calculateCommission();
    }
}
