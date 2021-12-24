package MinutesToYearsAndDaysCalculator;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid value");
        }
        long days = minutes / 24;
        long daysReminder = minutes % 24;
        long years = minutes / 360;
        long yearsReminder = minutes % 360;
        System.out.println(minutes + " min = " + years + " y = " + days + " d");
    }
}
