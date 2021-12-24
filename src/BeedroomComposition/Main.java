package BeedroomComposition;

public class Main {
    public static void main(String[] args) {
      Ceiling ceiling = new Ceiling("light-blue");
      Door door = new Door(1);
      TV tv = new TV("Sonny",true);
      Walls walls = new Walls("north wall","south wall", "west wall", "east wall", "light-blue" );

      Bedroom ramonBedroom = new Bedroom(walls,ceiling,door,tv);

      ramonBedroom.powerOnTV();
      ramonBedroom.paintingWalls();
      ramonBedroom.openDoor();
    }
}
