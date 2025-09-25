import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Actions list
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        // Instantiate GameMenu
        GameMenu theGameMenu = new GameMenu(actions);

        // 5.d: Call promptUser and save the return value
        String userChoice = theGameMenu.promptUser();

        // 5.g: Convert String to int
        int actionNumber = Integer.parseInt(userChoice);

        // 5.f: Call doAction with the user's choice
        doAction(actionNumber);
    }

    // 5.e and 5.f: Method to execute action
    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid choice! Please select a number between 1 and 4.");
        }
    }
}
