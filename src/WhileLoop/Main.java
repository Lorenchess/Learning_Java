package WhileLoop;

public class Main {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int counter = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            counter++;
            System.out.println("The number " + number + " is even.");
            if(counter == 5){
                System.out.println("Exiting the while loop");
                break;
            }
        }
    }
    public static boolean isEvenNumber(int number){
        if(number < 0){
            System.out.println("Invalid value");
            return false;
        }
        else if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
