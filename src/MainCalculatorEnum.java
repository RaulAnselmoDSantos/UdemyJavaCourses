import enums.EnumOperation;

import java.util.Scanner;

public class MainCalculatorEnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        var options = -1;
        while(options != 5){

            System.out.println("Please enter a number between 1 and 5");
            options = sc.nextInt();

            System.out.println("1 - Sum");
            System.out.println("2 - Substraction");
            System.out.println("3 - Multiplication");
            System.out.println("5 - Division");
            System.out.println("5 - Exit");

            if(options > 5 || options < 1){
                System.out.println("Please enter a number between 1 and 5");
                continue;
            }

            if(options == 5) break;

            var selectedOption = EnumOperation.values()[options - 1];

            System.out.println("Type the first number to the operation");
            var Fnumber = sc.nextInt();

            System.out.println("Type the second number to the operation");
            var Snumber = sc.nextInt();

            var result = selectedOption.getCalculate().apply(Fnumber, Snumber);

            System.out.printf("%s %s %s = %s \n", Fnumber, selectedOption.getSymbol(), Snumber, result);
        }
    }
}
