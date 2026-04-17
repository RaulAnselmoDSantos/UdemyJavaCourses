package entities;

public abstract class Taxpayer {
    private String name;
    private Double annualIncome;

    public Taxpayer() {
    }

    public Taxpayer(Double annualIncome, String name) {
        this.annualIncome = annualIncome;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract Double tax();
}
