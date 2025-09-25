import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Step 4.f: Create ArrayList<String> and add actions
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Step 4.g: Instantiate GameMenu with actions
        GameMenu theGameMenu = new GameMenu(actions);

        // Step 4.i: Test displayMenu
        theGameMenu.displayMenu();
    }
}
