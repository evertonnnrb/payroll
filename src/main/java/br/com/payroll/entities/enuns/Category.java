package br.com.payroll.entities.enuns;

public enum Category {
    FINANCIAL("Financial"),
    MANAGER("Manager"),
    PRODUCTION_LINE("Production line"),
    SELLER("Seller");

    Category(String category) {
        this.category = category;
    }

    private String category;

    public void setCategory(String category) {
        this.category = category;
    }
}
