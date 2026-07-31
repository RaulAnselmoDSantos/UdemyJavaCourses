package entities;

public final class OutsoircedEmployee extends Employee {
    private Double additionalCharge;

    public OutsoircedEmployee() {
    }

    public OutsoircedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return ((getHours() * getValuePerHour()) + (additionalCharge * 1.1));
    }
}
