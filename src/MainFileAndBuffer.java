import java.io.*;

public class MainFileAndBuffer {
    public static void main(String[] args){
        String path = "c:\\Users\\raul\\ina.txt";

        try (BufferedReader bw = new BufferedReader(new FileReader(path))){

            String line = bw.readLine();

            while(line != null){
                System.out.println(line);
                line = bw.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
