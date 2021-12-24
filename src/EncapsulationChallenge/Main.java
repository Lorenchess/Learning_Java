package EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {
      Printer myPrinter = new Printer(50,100,true);

      myPrinter.getTonerLevel();
      myPrinter.fillToner(30);
      myPrinter.getTonerLevel();
      myPrinter.getNumberOfPages();
      myPrinter.addingPages(20);
      myPrinter.getNumberOfPages();


    }
}
