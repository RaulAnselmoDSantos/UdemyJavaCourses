import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTryCatchExemple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //The try block must have the code witch must contain the exception
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        //For witch type of exception possíble we make a catch
        }catch(InputMismatchException e){
            System.out.println("Please enter a number");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
        }

        sc.close();
    }
}
