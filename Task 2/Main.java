import java.util.Scanner; // 2.c: Skal altid være i toppen

public class Main {
    public static void main(String[] args) {
        // 2.b: Spørg om navn
        System.out.println("Please type your name");

        // 2.c: Lav en Scanner objekt
        Scanner scanner = new Scanner(System.in);

        // 2.d: Læs brugerens navn
        String name = scanner.nextLine();

        // 2.e: Hils brugeren og spørg for alderen
        System.out.println("Hello " + name);
        System.out.println("Please type your age");

        // 2.f: Læs brugerens alder
        int age = scanner.nextInt();

        // 2.g: Print brugerens alder
        System.out.println("You are " + age + " years old");

        // 2.h: Regn hvor mange år der er tilbage til pension, og print det
        int yearsUntilRetirement = 67 - age;
        System.out.println("You have " + yearsUntilRetirement + " years until retirement");
        
        // Luk scanneren
        scanner.close();
    }
}
