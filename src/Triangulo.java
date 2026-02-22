import java.util.Locale;
import java.util.Scanner;
import figuras.Triangle;

/*
* Atividade: Orientação a Objetos
* */
public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC, pX, pY, areaX, areaY;

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measure of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        sc.close();

        /*
        pX = (xA + xB + xC)/2;
        pY = (yA + yB + yC)/2;

        areaX = Math.sqrt(pX* (pX-xA) * (pX-xB) * (pX-xC));
        areaY = Math.sqrt(pY* (pY-yA) * (pY-yB) * (pY-yC));
         */

        System.out.printf("Triangle X area: %.4f%n", x.area());
        System.out.printf("Triangle Y area: %.4f%n", y.area());

        if(x.area() > y.area()){
            System.out.println("Larger area: X");
        } System.out.println("Larger area: Y");
    }
}