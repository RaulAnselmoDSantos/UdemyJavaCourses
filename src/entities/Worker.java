package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HoursContract> contracts = new ArrayList<>();

    public Worker() {}

    public Worker(String name, WorkerLevel level, Department department, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HoursContract> getContracts() {
        return contracts;
    }

    public void addContract(HoursContract contract){
         this.contracts.add(contract);
    }

    public void  removeContract(HoursContract contract){
         this.contracts.remove(contract);
    }

    public double income(Integer year, Integer month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for( HoursContract c :  contracts){
            if((year == c.getDate().getYear()) && month == c.getDate().getMonthValue()){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
