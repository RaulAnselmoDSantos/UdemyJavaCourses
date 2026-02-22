import java.util.Scanner;

public class MainNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números pretende digitar?");
        int qN = sc.nextInt();

        double[] v = new double[qN];

        for(int i = 0; i < v.length; i++){
            System.out.print("Digite o numero: ");
            v[i] = sc.nextDouble();
        }
        System.out.println("Números negativos:");
        for(int  i = 0; i < v.length; i++){
            if(v[i] < 0){
                System.out.println(v[i]);
            }
        }

        sc.close();
    }
}
