import entities.Order;
import entities.enums.OrderStatus;

import java.sql.SQLOutput;
import java.util.Date;

public class MainEnumsExemple {
    public static void main(String[] args) {

        //Creating an order
        Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);
        //Using the toString Overrided method
        System.out.println(order);

        //Using the Enum as Usual
        OrderStatus os1 = OrderStatus.DELIVERED;
        //Converted the String to an Enum, the string must be a valid enum
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);


    }
}
