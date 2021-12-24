package speedConverter;

public class SpeedConverter {

  public static long toMilesPerHour(double kilometersPerHour) {
    double milesPerKilometer = 1.609;
    if (kilometersPerHour < 0) {
      return -1;
    } else {
      long milesPerHour = Math.round(kilometersPerHour / milesPerKilometer);
      return milesPerHour;
    }
  }

  public static void printConversion(double kilometersPerHour) {
    if (kilometersPerHour >= 0) {
      long milesPerHour = toMilesPerHour(kilometersPerHour); //calling the above method and storing the return in a
      // variable to be use in the display message.
      System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    } else {
      System.out.println("Invalid Value");
    }
  }
}
