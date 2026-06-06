import java.util.Scanner;

import static java.lang.String.format;

public class MainSwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Inform a number between 1 and 7: ");
        var option = scanner.nextInt();

        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é $s", option);
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Invalid option!";
        };
        System.out.println(message);
    }
}