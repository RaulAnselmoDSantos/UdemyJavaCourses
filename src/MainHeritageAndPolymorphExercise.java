import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.nio.file.attribute.UserPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainHeritageAndPolymorphExercise {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> lp = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Product #" + n + "data: ");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(ch == 'c'){
                Product c = new Product(name, price);
                lp.add(c);
            }
            if(ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY):");
                Date date = dateFormat.parse(sc.next());
                Product u = new UsedProduct(name, price, date);
                lp.add(u);
            }
            if(ch == 'i'){
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                Product ip = new ImportedProduct(name, price, fee);
                lp.add(ip);
            }
        }
        System.out.println("Price Tags: ");
        for(Product p : lp){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
