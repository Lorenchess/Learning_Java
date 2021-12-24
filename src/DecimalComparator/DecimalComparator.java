package DecimalComparator;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        String format1 = decimalFormat.format(firstNumber);
        System.out.println(format1);
        String format2 = decimalFormat.format(secondNumber);
        System.out.println(format2);
        if(format1.equals(format2)){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
