package GenericsII;

//A complete Generic class where we can pass any type, since the I and S are generics...

public class Container<I, S> {
    private I item1;
    private S item2;

    public Container(I item1, S item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems(){
        System.out.println("Printing content of Container");
        System.out.println("Item1: " + item1);
        System.out.println("Item2: " + item2);
    }

    public I getItem1() {
        return item1;
    }

    public S getItem2() {
        return item2;
    }
}
