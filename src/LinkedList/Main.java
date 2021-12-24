package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ramon", 54.96);
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);


        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2); //in ArrayList inserting element value 2 in slot 1, moves all the rest elements

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        //Example for LinkList

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Paris");
        placesToVisit.add("New York");
        placesToVisit.add("Lisbon");
        placesToVisit.add("Barcelona");
        placesToVisit.add("Dallas");
        placesToVisit.add("Miami");

        printList(placesToVisit);

        placesToVisit.add(1,"Berlin");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> places){
        Iterator<String> i = places.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("========================");
    }

    private static boolean addInOrder(LinkedList<String> places, String newCity){
        ListIterator<String> stringListIterator = places.listIterator();

        while(stringListIterator.hasNext()){
             int comparison = stringListIterator.next().compareTo(newCity);
             if(comparison == 0){
                 //equal do not add
                 System.out.println(newCity + " is already included as a destination");
                 return false;
             } else if(comparison > 0){
                 ///new city should appear before this one
                 stringListIterator.previous(); //List iterator allows us to go back
                 stringListIterator.add(newCity);
                 return true;
             } else if (comparison < 0){
                 //move on next city
             }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
