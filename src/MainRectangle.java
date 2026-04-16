import java.util.Scanner;
import entities.Rectangle;

public class MainRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rt = new Rectangle();

        System.out.println("Enter the rectangle width and height: ");
        rt.width = sc.nextDouble();
        rt.height = sc.nextDouble();

        System.out.println("Area = " + rt.area());
        System.out.println("Perimeter = " + rt.perimeter());
        System.out.println("Diagonal = " + rt.diagonal());
    }
}
