import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainFileWritterAndBufferedWritter {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good Mornig", "Good Afternoon", "Good Evening", "Good Night"};

        String path = "c:\\Users\\raul\\ina.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
