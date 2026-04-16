import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAbstractExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Shape> sp = new ArrayList<>();

        System.out.print("Enter the number of shapes:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape s = new Rectangle(color, width, height);
                sp.add(s);
            }
            if(ch == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape s = new Circle(color, radius);
                sp.add(s);
            }
        }
        System.out.println("Shapes: ");
        for(Shape s : sp){
            System.out.printf("%.2f", s.area());
        }
    }
}
