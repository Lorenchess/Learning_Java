package FeetAndInchesToCentimeters;

public class FeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && inches >= 0 && inches <= 12){
            double footToCentimeters = 30.48;
            double inchesToCentimeters = 2.54;
           double totalFeedInCentimeter =  (feet * footToCentimeters);
           double totalInchesInCentimeters = (inches * inchesToCentimeters);
//            System.out.println("For " + (int)feet + " feet we get " + Math.round(totalFeedInCentimeter) + " cm");
//            System.out.println("For " + (int)inches + " inches we get " + Math.round(totalInchesInCentimeters) + " cm");
        } else {
            return -1;
        }
        return 1;
    }
    public static void printFeetAndInchesToCentimeters(double feet, double inches){
        System.out.println("For " + (int)feet + " feet we get " + Math.round(calcFeetAndInchesToCentimeters(feet,
                inches)) +
                " cm");
        System.out.println("For " + (int)inches + " inches we get " + Math.round(calcFeetAndInchesToCentimeters(feet,
                inches)) +
                " cm");
    }
}
