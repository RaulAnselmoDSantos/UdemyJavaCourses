package entities;

public class TaxpayerLegalPerson extends Taxpayer {
    private Integer nEmployees;

    public TaxpayerLegalPerson() {
        super();
    }

    public TaxpayerLegalPerson(Double annualIncome, String name, Integer nEmployees) {
        super(annualIncome, name);
        this.nEmployees = nEmployees;
    }

    public Integer getnEmployees() {
        return nEmployees;
    }

    public void setnEmployees(Integer nEmployees) {
        this.nEmployees = nEmployees;
    }

    @Override
    public Double tax() {
        double value = 0;
        if(nEmployees < 10){
            value = (getAnnualIncome() * 0.16);
        }else {
            value = (getAnnualIncome() * 0.14);
        }
        return value;
    }
}
