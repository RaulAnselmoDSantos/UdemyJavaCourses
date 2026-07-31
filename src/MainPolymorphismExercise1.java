import entities.Employee;
import entities.OutsoircedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainPolymorphismExercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employs: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + " data: ");
            System.out.print("Outsourced (y/n): ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value Per Hour: ");
            sc.nextLine();
            Double vHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional Charge: ");
                Double charge = sc.nextDouble();
                Employee ep = new OutsoircedEmployee(name, hours, vHour, charge);
                list.add(ep);
            }
            if(ch == 'n'){
                Employee ep = new Employee(name, hours, vHour);
                list.add(ep);
                System.out.println("Employee #" + (i+1) + " Created");
            }
        }
        System.out.println("Payments: ");
        for(Employee ep : list){
            System.out.println(ep.getName() + " - $" + ep.payment());
        }
        sc.close();
    }
}
