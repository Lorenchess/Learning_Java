package Lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );

        //The Function, functional interface it takes a Car object and returns a String type and with the abstract
        // method apply() we can use that results....

        Function<Car, String> priceAndColor = (c) ->
          "Price = " + c.getPrice() + " color = " + c.getColor();

        String carString = priceAndColor.apply(cars.get(0));
        System.out.println(carString);

//        printCarsPriceRange(cars, 18000, 22000);
//        printCarByColor(cars, "Red");

        printCars(cars,(c)-> c.getPrice() >= 1800 && c.getPrice()<= 22000);//Lambda that implements the method test.()
        System.out.println("Print blue cars");
        printCars(cars,(c)-> c.getColor().equals("Blue")); //Lambda that implements the method test.() from Condition FI
    }

    public static void printCars(List<Car> cars, Predicate<Car> condition){
        for (Car c : cars){
            if(condition.test(c)){
                c.printCar(); //method in Car class that prints the instance of the car that pass condition.test()
            }
        }
    }

//    public static void printCarsPriceRange(List<Car> cars, int low, int high) {
//        for(Car c: cars) {
//            if(low <= c.getPrice() && c.getPrice() <= high) {
//                c.printCar();
//            }
//        }
//    }
//
//    public static void printCarByColor(List<Car> cars, String color) {
//        for(Car c: cars) {
//            if(c.getColor().equals(color)) {
//                c.printCar();
//            }
//        }
//    }

}
