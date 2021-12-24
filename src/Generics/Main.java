package Generics;


public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer duke = new BaseballPlayer("Duke Hernandez");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team<FootballPlayer> adelaide = new Team<>("Adelaide Crows");
        adelaide.addPLayer(joe);
//        adelaide.addPLayer(duke);
//        adelaide.addPLayer(ronaldo);

        Team<BaseballPlayer> baseballTeam = new Team<>("Yankees");
        baseballTeam.addPLayer(duke);

        System.out.println(adelaide.numPlayers());

        Team<SoccerPlayer> madrid = new Team<>("Real Madrid");
        madrid.addPLayer(ronaldo);

        Team<SoccerPlayer> barcelona = new Team<>("Barcelona");
        barcelona.addPLayer(messi);

        madrid.matchResult(barcelona,3,1);
        madrid.matchResult(barcelona,2,2);
        madrid.matchResult(barcelona,4,3);
        madrid.matchResult(barcelona,0,1);

        System.out.println("Rankings...");
        System.out.println(madrid.getName() + ": " + madrid.ranking());
        System.out.println(barcelona.getName() + ": " + barcelona.ranking());

        System.out.println(madrid.compareTo(barcelona));




        ///Team<String> I cannot create a team with another type than Player because we extended Player in our Team
        // class, so it enforces the type: public class Team<T extends Player>
    }
}
