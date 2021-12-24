package TeenNumberChecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
        if(isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)){
            System.out.println("In range");
            return true;
        } else {
            System.out.println("Not in range");
            return false;
        }
    }

    public static boolean isTeen(int number){
      return number > 12 && number < 20 ? true : false;
    }
}
