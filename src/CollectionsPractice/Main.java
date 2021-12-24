package CollectionsPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      List<Vehicle> cars = new ArrayList<>();

      //creating and adding to the ArrayList a new Vehicle in the fly without assigning any reference variable

        cars.add(new Vehicle("Hyunday","Sonata",2021,30000,false));
        cars.add(new Vehicle("Jeep","Wrangler",2021,25000,true));

      //Now let's create a new variable and assign a new Vehicle

      Vehicle car1 = new Vehicle("Toyota", "Camry",2021,40000,true);

      //now we add it to the ArrayList
        cars.add(car1);

      /// Another  example of Collections List ...LinkList
      List<String> animals = new LinkedList<>();

      animals.add("Dog");
      animals.add("Cat");
      animals.add("Fish");
      animals.add("Caw");


        //Printing the ArrayList and LinkList...

        printElements(cars);
        printElements(animals);


        for (Vehicle car: cars) {
            //System.out.println("The ArrayList contains: " + car.getMake()+ " " + car.getModel() + " "+
            // car.getYear());
            //After overwriting the toString method in the Vehicle class we can print friendly the results of the loop
            //System.out.println(car);
        }
    }

    //Notice that the type of the parameter has to be the parent of LinkList and ArrayList: LIST for us to able to
    // use the method with both lists...

    public static void printElements(List myLists){
        for (int i = 0; i < myLists.size(); i++) {
            System.out.println(myLists.get(i));
        }
    }
}
