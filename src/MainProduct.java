
import java.util.Scanner;
import entities.Product;

public class MainProduct {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name:");
        p1.setName(sc.nextLine());

        System.out.print("Price:");
        p1.setPrice(sc.nextDouble());

        System.out.print("Quantity:");
        p1.setQuantity(sc.nextInt());

        System.out.println(p1);

        System.out.print("Enter the number of the products to be added in stock: ");
        p1.AddProducts(sc.nextInt());

        System.out.print("Enter the number of the products to be removed from stock: ");
        p1.RemoveProducts(sc.nextInt());

        sc.close();
    }
}
