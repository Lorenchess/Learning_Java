package EncapsulationChallenge;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        if(tonerLevel > 0 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPages = numberOfPages;
        this.isDuplex = isDuplex;
    }
    public int fillToner(int fill){
        System.out.println("Filling toner");
        return this.tonerLevel += fill;
    }
    public int addingPages(int pages){
        System.out.println("Adding pages");
        return numberOfPages += pages;
    }

    public int getTonerLevel() {
        System.out.println("The level of the toner is " + tonerLevel);
        return tonerLevel;
    }

    public int getNumberOfPages() {
        System.out.println("The actual number of pages is " + numberOfPages);
        return numberOfPages;
    }
}
