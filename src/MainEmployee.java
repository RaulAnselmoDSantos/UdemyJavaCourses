import entities.Employee;

import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee ep = new Employee();

        System.out.println("Enter with the employee data: ");

        System.out.print("Name: ");
        ep.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        ep.setGrossSalary(sc.nextDouble());

        System.out.print("Tax: ");
        ep.tax = sc.nextDouble();

        System.out.println(ep);

        System.out.print("Which percentage to increase salary? ");
        ep.increseSalary(sc.nextDouble());

    }
}
