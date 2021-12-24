package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
//    GroceryList groceryList = new GroceryList(); //we need to use a private static for creating the obj groceryList
//    ,so we can use that instance of GroceryList inside other methods like addItem()...

      boolean quit = false;
      int choice = 0;
      printInstructions();
      while(!quit){
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); //always use after a scanner.nextInt() to create the line separator

        switch(choice){
          case 0:
            printInstructions();
            break;
          case 1:
            groceryList.printGroceryList();
            break;
          case 2:
            addItem();
            break;
          case 3:
            modifyItem();
            break;
          case 4:
            removeItem();
            break;
          case 5:
            searchForItem();
            break;
          case 6:
            processArrayList();
            break;
          case 7:
            System.out.println("Application finished.");
            groceryList.printGroceryList();
            System.out.println("Thank you for using our shopping list application!");
            quit = true;
           break;
        }
      }
    }

  public static void printInstructions(){
      System.out.println("\nPress");
      System.out.println("\t 0 - To print choice options.");
      System.out.println("\t 1 - To print the list of grocery items.");
      System.out.println("\t 2 - To add an item to the list.");
      System.out.println("\t 3 - To modify an item in the list.");
      System.out.println("\t 4 - To remove an item from the list.");
      System.out.println("\t 5 - To search an item in the list.");
      System.out.println("\t 6 - To print the list.");
      System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem(){
      System.out.print("Please enter the grocery item: ");
      groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
      System.out.print("Enter item name to modify: ");
      String itemName = scanner.nextLine();

      System.out.println("Enter replacement item: ");
      String newItem = scanner.nextLine();
      groceryList.modifyGroceryItem(itemName, newItem); //since arrays are base 0 we need to set itemNum - 1
    }

    private static void removeItem() {
      System.out.println("Enter the item name you want to remove: ");
      String itemName = scanner.nextLine();
      groceryList.removeGroceryItem(itemName);
    }

    private static void searchForItem() {
      System.out.println("Enter item to search for: ");
      String searchItem = scanner.nextLine();
      if(groceryList.onFile(searchItem)){
        System.out.println("Found " + searchItem + " in our grocery list.");
      } else {
        System.out.println(searchItem + " is not in our shopping list.");
      }
    }

    public static void processArrayList(){
      ArrayList<String> newArray = new ArrayList<>();
      newArray.addAll(groceryList.getGroceryList()); // a way to copy the entire array to a new ArrayList.

      ArrayList<String> newArr = new ArrayList<>(groceryList.getGroceryList()); //copy entire array to a new ArrayList.

      //Converting to a regular array
      String[] myArray = new String[groceryList.getGroceryList().size()]; //setting up the size of the array
      myArray = groceryList.getGroceryList().toArray(myArray);
      System.out.println("My grocery list items are: " + Arrays.toString(myArray));
    }

}

