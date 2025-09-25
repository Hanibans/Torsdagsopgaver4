import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
    private ArrayList<String> actions;

    // Constructor
    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    // Display the menu options
    public void displayMenu() {
        System.out.println("Game Menu:");
        for (String action : actions) {
            System.out.println(action);
        }
    }

    // 5.a: Create a method with promptUser that prints a sentence
    public String promptUser() {
        System.out.println("Type a number to choose an action:");
        displayMenu(); // reuse displayMenu to show actions

        // 5.b: Create a new Scanner object and read user's input (Similar to 2.c and 2.d)
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine(); // get input as String

        // 5.c: Return user's input
        return choice;
    }
}
