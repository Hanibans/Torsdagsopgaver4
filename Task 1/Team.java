import java.util.ArrayList;

public class Team {
    // 1.c, 1.d and 1.e: Add private variables
    private String name;
    private int rank;
    private ArrayList<String> players;

    // 1.f: Make a constructor for the team name
    public Team(String teamName) {
        this.name = teamName;
        this.players = new ArrayList<>();
    }

    // 1.h: Add a method for the rank
    public void setRank(int rank) {
        this.rank = rank;
    }

    // 1.l: Add a method to add a player
    public void addPlayer(String playerName) {
        players.add(playerName);
    }

    // 1.j and 1.m: toString method (returns playername as text)
    public String toString() {
        String result = "Hold: " + name + " Rang: " + rank + "\n";
        result += "Spillere:\n";
        for (String player : players) {
            result += "- " + player + "\n";
        }
        return result;
    }
}
