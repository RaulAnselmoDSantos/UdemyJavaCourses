import java.util.Scanner;

public class MainMatricesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrices = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrices[i][j] = sc.nextInt();
            }
        }


        sc.close();
    }
}
