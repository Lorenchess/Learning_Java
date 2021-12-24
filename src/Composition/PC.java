package Composition;

//this is also composition, a PC class has a monitor, case and motherboard. We cannot use the extends keyword more
// than once in Java does what we use Composition instead.

public class PC {
    private Case theCase; //a PC Has-A Case...
    protected Monitor monitor; //a PC Has-A Monitor...
    private Motherboard motherboard; //Because a PC has a motherboard...monitor and case, we create variables/fields
    // from the classes that belong to the PC main class.

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton(); //we inherit the Case method pressPowerButton
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    public void openProgram (String program) {
        motherboard.loadProgram(program);
    }
}
