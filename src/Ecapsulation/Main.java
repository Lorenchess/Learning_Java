package Ecapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name= "Ramon";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        damage = 11;
//        //since everything is public anyone can change the rules of the game by for instance putting player.health=200;
//        //The class we are calling here "player" is able to change the fields manually;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
        ///////////////////////////////////////////////////

       EnhancePlayer player = new EnhancePlayer("Richard", 50, "Sword");
        System.out.println("Initial player's health is " + player.getHealth());
        player.loseHealth(10);
        System.out.println("Current player's health is " + player.getHealth());
   }

}
