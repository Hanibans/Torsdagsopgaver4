public class Main {
    public static void main(String[] args) {
        // 1.g, 1.i and (1.l): Create one team
        Team team1 = new Team("De Uovervindelige");
        team1.setRank(3);
        team1.addPlayer("Kojo");
        team1.addPlayer("Sami");
        team1.addPlayer("Andreas");
        team1.addPlayer("Jonas");
        System.out.println(team1);

        // 1.k: Create 5 more teams
        Team team2 = new Team("De Modige");
        team2.setRank(1);
        team2.addPlayer("Sebastian");
        team2.addPlayer("Sofus");
        team2.addPlayer("Marcus");
        team2.addPlayer("Peter");
        System.out.println(team2);

        Team team3 = new Team("De Frygtløse");
        team3.setRank(5);
        team3.addPlayer("Nicolai");
        team3.addPlayer("Altina");
        team3.addPlayer("Usman");
        team3.addPlayer("Hannah");
        System.out.println(team3);

        Team team4 = new Team("De Smarte");
        team4.setRank(6);
        team4.addPlayer("Mikkel");
        team4.addPlayer("Christian");
        team4.addPlayer("Nastaran");
        team4.addPlayer("Kristina");
        System.out.println(team4);

        Team team5 = new Team("De Lynhurtige");
        team5.setRank(4);
        team5.addPlayer("Katarina");
        team5.addPlayer("Ali");
        team5.addPlayer("Nali");
        team5.addPlayer("Alex");
        System.out.println(team5);

        Team team6 = new Team("De stærke");
        team6.setRank(2);
        team6.addPlayer("Alex");
        team6.addPlayer("Jama");
        team6.addPlayer("Emil");
        team6.addPlayer("Olli");
        System.out.println(team6);
    }
}