package OOP;

//The responsibility of creating instances of this parent class is the
// Main class. The Main class will also call/invoke the methods on those instances/objects

public class Main {
    public static void main(String[] args) {
     Human michael = new Human("Michael","Lorente Blanco", 4,true,false,false,false);
     michael.eating(7);
     michael.eating(10);
     michael.playing();
     michael.working("Monday",12,true);
     michael.sleeping(2);
     michael.birthday(20);
     michael.working("Tuesday",13,true);

     Human ramon = new Human("Ramon", "Lorente", 36,false,false,false,false);
     ramon.working("Saturday",12,true);
     ramon.birthday(1);
     ramon.sleeping(3);
     ramon.working("Monday", 15,true);

    }



}
