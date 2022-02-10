package Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.plusDays(5));
        System.out.println(now.plus(3, ChronoUnit.YEARS));

        LocalDate endYear = LocalDate.of(2022, 12, 31);
        System.out.println(endYear.getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfWeek());

        parseDate("02/09/2022");
    }

    public static void parseDate(String date) {
        try {
            Date today = new SimpleDateFormat("MM/dd/yyyy").parse(date);
            System.out.println(today);
        } catch(Exception ex) {
            System.out.println("Exception occurs " + ex);
        }

    }
}
