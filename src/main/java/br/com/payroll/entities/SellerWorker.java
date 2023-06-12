package br.com.payroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerWorker extends Employee {
    private Double commission;
    private Double quantitySoldMonth;

    @Override
    public String toString() {
        return "Seller commission= " + Math.round(commission * 100) + " percent" +
                ", quantitySoldMonth=" + String.format("R$ %.2f", quantitySoldMonth);
    }
}
