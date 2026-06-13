import java.io.File;
import java.util.Scanner;

public class MainPastas {
    public static void main(String[] args) {
        //Here we are gonna see a few ways to deal with directories
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the folder path: ");
        String strPath = sc.nextLine();
        System.out.println("Files: ");

        File path = new  File(strPath);
        //Filled the array with the directories in the path with this expression
        File[] folders = path.listFiles(File::isDirectory);

        //list all folders in the lambda expression above
        for (File folder : folders){
            System.out.println(folder);
        }
        //Filled the array with the files in the path with this expression
        File[] files = path.listFiles(File::isFile);

        System.out.println("---------------------------------------");
        System.out.println("Files: ");
        //list all files in the path using the array who we filled with files
        for (File file : files){
            System.out.println(file);
        }
        System.out.println("---------------------------------------");
        System.out.println("Directories: ");
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directories created successfully: " + success);

        sc.close();
    }
}
