package br.com.payroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor @AllArgsConstructor
public class FinancialWorker extends Employee{
    private Double subisistenceAllowance;
}
