package InheritanceChallengeII;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
       int newVelocity = getCurrentVelocity() + rate; //Keep in mind that a negative number will des-accelerate
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else {
            changeGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity, direction);
        System.out.println("The Outlander moves at " + velocity + " miles" + " at " + direction + " degrees");
    }
}
