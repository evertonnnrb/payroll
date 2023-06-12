package br.com.payroll.service;

import br.com.payroll.entities.Employee;

public interface PayRollService {
    double baseSalary();
    double grossSalary();
    double taxSalary();
    double bonus();
    double extraBonus();
    double netSalary();


}
