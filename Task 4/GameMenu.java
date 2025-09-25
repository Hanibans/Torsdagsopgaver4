import java.util.ArrayList;

public class GameMenu {
    // Step 4.b: Private instance variable
    private ArrayList<String> actions;

    // Step 4.c & 4.d: Constructor with ArrayList parameter
    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    // Step 4.h: Add displayMenu method
    public void displayMenu() {
        System.out.println("Game Menu:");
        for (String action : actions) {
            System.out.println(action);
        }
    }
}
