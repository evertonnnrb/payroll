package br.com.payroll.entities;

public class SellerWorker extends Employee {
    private Double commission;
    private Double quantitySoldMonth;

    public SellerWorker(){}

    public SellerWorker(Person person, Character shift, Integer hoursWorked, double baseSalary, Double commission, Double quantitySoldMonth) {
        super(person, shift, hoursWorked, baseSalary);
        this.commission = commission;
        this.quantitySoldMonth = quantitySoldMonth;
    }

    public SellerWorker(Double commission, Double quantitySoldMonth) {
        super();
        this.commission = commission;
        this.quantitySoldMonth = quantitySoldMonth;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getQuantitySoldMonth() {
        return quantitySoldMonth;
    }

    public void setQuantitySoldMonth(Double quantitySoldMonth) {
        this.quantitySoldMonth = quantitySoldMonth;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Seller commission= " + Math.round(commission * 100) + " percent" +
                ", quantitySoldMonth=" + String.format("R$ %.2f", quantitySoldMonth);
    }
}
