import java.util.Scanner;

public class MainMatricesExecise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrices: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int [][] matrices = new int[rows][columns];

        System.out.println("Enter the matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrices[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter with the number to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrices[i][j] == search) {
                    System.out.println("position: " + i + "," + j);
                    if (i > 0){
                        int x = matrices[i - 1][j];
                        System.out.println("Up: " + x);
                    }
                    if (j > 0){
                        int y = matrices[i][j - 1];
                        System.out.println("Left: " + y);
                    }
                    if (i < matrices[i].length - 1){
                        int z = matrices[i + 1][j];
                        System.out.println("Down: " + z);
                    }
                    if (j < matrices[i].length - 1){
                        int b =  matrices[i][j + 1];
                        System.out.println("Right: " + b);
                    }
                }
            }
        }
        sc.close();
    }
}
