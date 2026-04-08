package entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;
    private int id;
    private Integer hours;
    private Double valuePerHour;

    public Employee() {
    }

    public Employee(int id, String name, double grossSalary){
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
    }

    //For the exercise of Polymorphism
    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double nextSalary(){
        return grossSalary - tax;
    }

    public void increseSalary(double percentage){
        grossSalary += grossSalary*(percentage/100);
        System.out.println("Update: " + toString());
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return '\'' + " Employee:" + '\'' +
                "Id: " + id + '\'' +
                "name='" + name + '\'' +
                ", grossSalary=" + nextSalary() + '\'' +
                ", tax=" + tax + '\'';
    }
}
