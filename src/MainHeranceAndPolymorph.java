import entities.Taxpayer;
import entities.TaxpayerLegalPerson;
import entities.TaxpayerNaturalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainHeranceAndPolymorph {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        List<Taxpayer> tp = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.print("Tax payer #"+ i +" data:");
            System.out.print("Individual or company (i/c)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health Expenditure: ");
                double healthExpenditure = sc.nextDouble();
                Taxpayer tpi = new TaxpayerNaturalPerson(annualIncome, name, healthExpenditure);
                System.out.println("Individual Payer create");
                tp.add(tpi);
            }
            if(ch == 'c'){
                System.out.print("Number of Employees: ");
                int empNum = sc.nextInt();
                Taxpayer tpc = new TaxpayerLegalPerson(annualIncome, name, empNum);
                System.out.println("Individual Payer create");
                tp.add(tpc);
            }
        }

        System.out.println("Taxes Paid: ");
        double ttp =0;
        for(Taxpayer tpi : tp){
            System.out.println(tpi.getName() + ": $ " + tpi.tax());
            ttp += tpi.tax();
        }
        System.out.println("Total Taxes Paid: " + ttp);
        sc.close();
    }
}
