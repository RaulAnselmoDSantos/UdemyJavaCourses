package entities;

public final class TaxpayerNaturalPerson extends Taxpayer {
    private Double healthSpent;

    public TaxpayerNaturalPerson(Double healthSpent) {
        super();
    }

    public TaxpayerNaturalPerson(Double annualIncome, String name, Double healthSpent) {
        super(annualIncome, name);
        this.healthSpent = healthSpent;
    }

    public Double getHealthSpent() {
        return healthSpent;
    }

    public void setHealthSpent(Double healthSpent) {
        this.healthSpent = healthSpent;
    }

    @Override
    public Double tax() {
        double value = 0;
        if(getAnnualIncome() < 20000.00){
            value = ((getAnnualIncome() * 0.15) - (healthSpent * 0.5));
        }
        if(getAnnualIncome() > 20000.00){
            value = ((getAnnualIncome() * 0.25) - (healthSpent * 0.5));
        }
        return value;
    }
}
