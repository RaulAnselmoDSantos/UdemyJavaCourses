package entities;

public class Employee {
    public String name;
    double grossSalary;
    public double tax;
    public int id;

    public Employee(int id, String name, double grossSalary){
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public Employee(){
        super();
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
