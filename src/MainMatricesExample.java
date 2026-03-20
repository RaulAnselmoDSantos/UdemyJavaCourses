import java.util.Scanner;

public class MainMatricesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the matrix.");
        int n = sc.nextInt();

        int[][] matrices = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter matrix elements [" + i + "][" + j + "]: ");
                matrices[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < matrices.length; i++) {
            System.out.print(matrices[i][i] + " ");
        }
        System.out.println();

        System.out.print("The amount of negative elements: ");
        int negative = 0;
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++) {
                if (matrices[i][j] < 0) {
                    negative++;
                }
            }
        }
        System.out.print(negative);

        sc.close();
    }
}
