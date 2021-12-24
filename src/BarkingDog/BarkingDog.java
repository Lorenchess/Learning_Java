package BarkingDog;

public class BarkingDog {
   public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
      if(hourOfDay < 0 || hourOfDay > 23){
          System.out.println("Invalid number of hours");
         return false;
      } else if(isBarking && hourOfDay < 8 || hourOfDay > 22){
          System.out.println("The dog is barking, I need to wake up!");
          return true;
       } else {
          System.out.println("I do not need to wake up!");
          return false;
       }
   }
}
