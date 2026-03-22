import entities.Department;
import entities.HoursContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainProgramWokerContract {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter with the name of Department: ");
        String departmentName = sc.nextLine();
        System.out.println();

        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level (JUNIOR, MID_LEVEL, SENIOR): ");
        String level = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker wk = new Worker(name, WorkerLevel.valueOf(level), new Department(departmentName), baseSalary);

        System.out.print("How many contracts to this worker? ");
        int numberOfContracts = sc.nextInt();
        for(int i = 1; i <= numberOfContracts; i++) {
            System.out.println("Enter the contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int durationHours = sc.nextInt();

            HoursContract hoursContract = new HoursContract(contractDate, valuePerHour, durationHours);
            wk.addContract(hoursContract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        System.out.print("Date (DD/MM/YYYY): ");
        String mouthAndYear = sc.next();
        int mouth = Integer.parseInt(mouthAndYear.substring(0, 2));
        int year = Integer.parseInt(mouthAndYear.substring(3));

        System.out.println("Name: " + wk.getName());
        System.out.println("Department: " + wk.getDepartment().getName());
        System.out.printf("Income for " + mouthAndYear + ": " + String.format("%2f", wk.income(year, mouth)));

        sc.close();
    }
}
