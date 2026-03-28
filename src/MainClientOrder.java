import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MainClientOrder {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the client name: ");
        String name = sc.nextLine();
        System.out.print("Enter the client's e-mail ");
        String mail = sc.nextLine();
        System.out.print("Enter the birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client c1 = new Client(name, mail, birthDate);
        System.out.println(c1);

        System.out.print("Enter the Order data: ");
        System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED,  DELIVERED): ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, c1);
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();
        for(int i = 1; i <= items; i++){
            System.out.println("Enter the " + i + "° item data: ");
            System.out.print("Product name:");
            //Cleaning the buffer
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Product quantity: ");
            int quantity = sc.nextInt();

            Product p1 = new Product(productName, price, quantity);
            OrderItem it = new OrderItem(quantity, price, p1);
            order.addItem(it);
            System.out.println("=-------------------------------=");
            System.out.println(it);
        }
        System.out.println("=-------------------------------=");
        System.out.println(c1);
        System.out.println("=-------------------------------=");
        System.out.println(order);


        sc.close();
    }
}
