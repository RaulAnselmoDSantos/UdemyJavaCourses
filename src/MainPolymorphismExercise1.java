import entities.Employee;
import entities.OutsoircedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPolymorphismExercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Employee> employee = new ArrayList<>();

        System.out.print("Enter the number of employs: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print("Outsourced (y/n): ");
            String ch = sc.next();
            if(ch.equals("y")){
                System.out.println("Employee #" + i + "data: ");
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value Per Hour: ");
                Double vHour = sc.nextDouble();
                System.out.print("Additional Charge: ");
                Double charge = sc.nextDouble();
                Employee ep = new OutsoircedEmployee(name, hours, vHour, charge);
                employee.add(ep);
            }
            if(ch.equals("n")){
                System.out.println("Employee #" + i + "data: ");
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value Per Hour: ");
                sc.nextLine();
                Double vHour = sc.nextDouble();
                Employee ep = new Employee(name, hours, vHour);
                employee.add(ep);
                System.out.println("Employee #" + i + " Created");
            }else {
                System.out.println("Invalid input");
                break;
            }
        }
        System.out.println("Payments: ");
        for(Employee ep : employee){
            System.out.println(ep.getName() + " - $" + ep.payment());
        }
        sc.close();
    }
}
