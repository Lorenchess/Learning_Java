package GenericChallenge;

public class Main {
    public static void main(String[] args) {
      LeagueTable<Team<BaseballPlayer>> baseballLeague = new LeagueTable<>("U.S Great League");

      BaseballPlayer duke = new BaseballPlayer("Duke Hernandez");
      BaseballPlayer mike = new BaseballPlayer("Mike Piazza");

      Team<BaseballPlayer> baseballTeam1 = new Team<>("Yankees");
      Team<BaseballPlayer> baseballTeam2 = new Team<>("Pirates");
      baseballTeam1.addPLayer(duke);
      baseballTeam2.addPLayer(mike);

        baseballLeague.addTeam(baseballTeam1);
        baseballLeague.addTeam(baseballTeam2);

        baseballTeam1.matchResult(baseballTeam2,10,8);
        baseballTeam1.matchResult(baseballTeam2,10,10);
        baseballTeam1.matchResult(baseballTeam2,10,8);
        baseballTeam1.matchResult(baseballTeam2,10,12);

        baseballLeague.printLeagueTable();


    }
}
