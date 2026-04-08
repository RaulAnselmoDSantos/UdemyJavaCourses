import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainListExecise {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the amount of Employers: ");
        int q = sc.nextInt();

        List<Employee> employees = new ArrayList<Employee>();

        for (int i = 1; i <= q; i++) {
            int id;
            String name;
            double salary;

            System.out.println("Enter the data of the " + i + "° employer");
            System.out.print("Id: ");
            id = sc.nextInt();
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Salary: ");
            salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));

            System.out.println(employees);
        }

        System.out.println("Enter the employer id that will have salary increase: ");
        int idTarget = sc.nextInt();
        System.out.println("Enter the percentage");
        int percentage = sc.nextInt();
        Employee emp =  employees.stream()
                .filter( s -> s.getId() == idTarget)
                .findFirst()
                .orElse(null);
        if (emp != null) {
            emp.increseSalary(percentage);
        } else {
            System.out.println("Employee not found, Id does not found!");
        }

        System.out.println(employees);
        sc.close();
    }
}
