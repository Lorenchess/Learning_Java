package Composition;

public class Dell extends Monitor{
    public Dell(String model, String manufacturer, int size, Resolution nativeResolution) {
        super(model, manufacturer, size, nativeResolution);
    }
    public void printMonitor () {
        System.out.println("My monitor is huge!!!");
    }
}
