package AreaCalculator;

public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0 ){
            System.out.println("Invalid value");
            return -1.0;
        }
        double areaCircle = radius * radius * Math.PI;
        System.out.println("The area of the circle is " + areaCircle);
        return areaCircle;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            System.out.println("Invalid value");
            return -1.0;
        }
        double areaRectangle = (x * y);
        System.out.println("The area of the rectangle is " + areaRectangle);
        return areaRectangle;
    }
}
