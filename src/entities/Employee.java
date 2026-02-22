package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double nextSalary(){
        return grossSalary - tax;
    }

    public void increseSalary(double percentage){
        grossSalary += grossSalary*(percentage/100);
        System.out.println("Update: " + toString());
    }

    @Override
    public String toString() {
        return "Employee:" +
                "name='" + name + '\'' +
                ", grossSalary=" + nextSalary() +
                ", tax=" + tax;
    }
}
