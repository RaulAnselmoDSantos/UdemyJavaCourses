import Model.entities.Clock;
import Model.entities.Clock12HoursFormat;
import Model.entities.Clock24HoursFormat;

public class MainClock {

    /*
     *  TODO:
     *  Write a class hierarchy to create clocks for different locations around the world.
     *  Define a parent class with Hour, Minute, and Second properties, including their respective
     *  getters and setters (adhering to standard clock behavior rules) and a method that returns
     *  the time in the HH:mm:ss format.
     *
     *  Based on this parent class, create 2 implementations: "AmericanClock" and "BrazilianClock",
     *  keeping in mind that the American clock does not use hours from 13 to 24.
     *
     *  Additionally, define an abstract method in the superclass whose implementation will be the
     *  responsibility of the subclasses. This method must accept a clock instance (regardless of
     *  its implementation), extract its time information, and use it to update the state of the
     *  current object.
     */

    public static void main(String[] args) {
        System.out.println("=== STARTING CLOCK SYSTEM TESTS ===\n");

        // 1. Criando instâncias iniciais
        System.out.println("--- Instantiating Clocks ---");
        Clock brasiliaClock = new Clock24HoursFormat(23, 15, 30);
        Clock newYorkClock = new Clock12HoursFormat(10, 5, 45, "AM");

        System.out.println("Brasilia (24h): " + brasiliaClock.returnHours());
        System.out.println("New York (12h): " + newYorkClock.returnHours());
        System.out.println();

        // 2. Testando a validação de limites nos Setters
        System.out.println("--- Testing Input Validations (Expect Errors) ---");
        System.out.print("[Test 24h Limits] ");
        Clock invalid24 = new Clock24HoursFormat(25, 61, -5);
        System.out.println("Fallback Output: " + invalid24.returnHours());

        System.out.print("[Test 12h Limits] ");
        Clock invalid12 = new Clock12HoursFormat(14, 30, 0, "AM");
        System.out.println("Fallback Output: " + invalid12.returnHours());
        System.out.println();

        // 3. Testando Sincronização: 24h -> 12h (Noite)
        System.out.println("--- Test: Syncing 24h into 12h (Night) ---");
        System.out.println("Source (Brasilia): " + brasiliaClock.returnHours()); // 23:15:30
        newYorkClock.sincronize(brasiliaClock);
        System.out.println("Target (New York) after sync: " + newYorkClock.returnHours()); // Expected: 11:15:30 PM
        System.out.println();

        // 4. Testando Sincronização: 12h -> 24h (Tarde)
        System.out.println("--- Test: Syncing 12h into 24h (Afternoon) ---");
        Clock custom12h = new Clock12HoursFormat(3, 45, 12, "PM");
        Clock custom24h = new Clock24HoursFormat(8, 0, 0);

        System.out.println("Source (12h): " + custom12h.returnHours()); // 03:45:12 PM
        custom24h.sincronize(custom12h);
        System.out.println("Target (24h) after sync: " + custom24h.returnHours()); // Expected: 15:45:12
        System.out.println();

        // 5. Testando os casos críticos: Meio-dia e Meia-noite
        System.out.println("--- Test: Critical Bounds (Midnight & Midday) ---");

        // Caso Meia-noite (00:20:00 -> 12:20:00 AM)
        Clock midnight24 = new Clock24HoursFormat(0, 20, 0);
        Clock target12 = new Clock12HoursFormat(1, 1, 1, "AM");
        target12.sincronize(midnight24);
        System.out.println("24h [00:20:00] converted to 12h: " + target12.returnHours());

        // Caso Meio-dia (12:15:00 PM -> 12:15:00)
        Clock midday12 = new Clock12HoursFormat(12, 15, 0, "PM");
        Clock target24 = new Clock24HoursFormat(0, 0, 0);
        target24.sincronize(midday12);
        System.out.println("12h [12:15:00 PM] converted to 24h: " + target24.returnHours());

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}
