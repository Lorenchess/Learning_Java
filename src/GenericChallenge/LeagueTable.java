package GenericChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println(team.getName() + " is already in the League");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " successfully added to the League.");
            return true;
        }
    }

    public void printLeagueTable(){
       sortTeams();
    }

    private void sortTeams(){
        //This method sort is working here because this class(LeagueTable) is extending the Team class that implements
        // Comparable, and overwrites the compareTo() method, so is already implementing a comparable method that
        // needs to be provided to the Collections.sort, so it will sort the league...

        Collections.sort(league);

        for(T t : league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
