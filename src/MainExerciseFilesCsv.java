import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExerciseFilesCsv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ReadPath = "C:\\repositorios\\UdemyJavaCourses\\src\\Util\\summary.csv";
        String WritePath = "C:\\repositorios\\UdemyJavaCourses\\out\\summary.csv";
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ReadPath))){
            String ReadLine = br.readLine();

            while(ReadLine != null){
                System.out.println(ReadLine);
                lines.add(ReadLine);  // Add the line before goes to the next
                ReadLine = br.readLine(); // Goes to the next line
            }
            System.out.println("---------------------------");
            for(String line : lines){
                String[] values = line.split(",");
                String name = values[0].trim();
                double price = Double.parseDouble(values[1].trim());
                int quantity = Integer.parseInt(values[2].trim());
                double value = quantity * price;

                StringBuilder sb = new StringBuilder();
                sb.append("Name: " + name).append(" , Price: $").append(String.format("%.2f", value));
                System.out.println(sb.toString());

                /*
                To Write the new lines in the local out/summary.csv
                but in the right format
                 */
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(WritePath,true))){
                    bw.write(sb.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
