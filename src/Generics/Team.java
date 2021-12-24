package Generics;

//we are not extending this class because is a Base Class

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

//The first T (bounded type parameter) is enforcing the type allowing any class to extend it and the "extends player"
// will enforce the
// creation of Team but only the classes that expend the Player class or subclass of PLayer.

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied= 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPLayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        } else if(theirScore > ourScore){
            lost++;
            message = " lost to ";
        } else {
            tied ++;
            message = " drew with ";
        }
        played++;

        //now we make sure we save our results as well the opponent without duplicating...
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }


    @Override
    public int compareTo(@NotNull Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
