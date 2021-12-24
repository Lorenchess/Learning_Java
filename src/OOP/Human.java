package OOP;
//OOP is a computer programming paradigm/model that organizes software design around Objects. An Object can be
// defined as a data field that has uniques attributes/variables/fields/state and behavior/methods/functions.
// Software objects consist of state and related behavior.

//Objects in real world have a state && behavior. In this case Michael has a state of firstName, lastName ...and
// it can have a behavior that are the actions the Michael class can perform, play, eat, sleep, running, walking...
//real-world objects vary in complexity; my desktop lamp may have only two possible states (on and off) and two
// possible behaviors (turn on, turn off)

//Software Objects are similar to real world object, software objects also consist of "state" and related "behavior".
// A SO stores its state in "fields"(variables) and exposes its behavior through Methods(functions). Methods operate
// in its objects fields and serve as primary way of communication between Objects (object-to-object-communication).

//Objects by itself are not so useful, like one human walking alone on earth. Object needs other objects to
// communicate. Objects use their methods as the primary mechanism of communication. Objects use "messages"(methods) to
// communicate with each other. Messages simply tell an object what to do. In Java, the act of sending a message to
// an object involves calling one of the object's methods. It is a common practice to pass additional information
// along with a message. This information is passed along with the message as "message parameters". More specifically, the message information is passed into a method as method parameters. Message passing is another way of saying "method calling." When an object sends a message to another object, it is really just calling a method on that object. The message parameters are really just the parameters to the method. The bottom line is that messages and methods are synonymous.

//Objects in real world have a state && behavior. Human is the parent class...A class is the blueprint from which
// individual objects are created. From this Human parent class we can create infinite instances of the class, lost
// of instances with related states and behavior. The responsibility of creating instances of this parent class is the
// Main class. The Main class will also call/invoke the methods on those instances/objects

public class Human {
    //Object state
    private String firstName;
    private String lastName;
    private int age;
    private boolean isHungry;
    private boolean isPlaying;
    private boolean isWorking;
    private boolean isSleeping;

    public Human(String firstName, String lastName, int age, boolean isHungry, boolean isPlaying, boolean isWorking, boolean isSleeping) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isHungry = isHungry;
        this.isPlaying = isPlaying;
        this.isWorking = isWorking;
        this.isSleeping = isSleeping;
    }

    //Basics methods (behavior) that will be "inherit" by all instances of Human class. The methods define its
    // interaction with the outside world.

    public void eating(double time){
        if(time >= 6 && time <= 7){
            isHungry = true;
            System.out.println(firstName + " is eating breakfast at " + time + "am.");
        }
        else if(time >= 12 && time <= 1){
            isHungry = true;
            System.out.println(firstName + " is eating lunch at " + time);
        }
        else if(time >= 18 && time <= 19){
            isHungry = true;
            System.out.println(firstName + " is eating dinner at " + time + "pm");
        }

        else {
            System.out.println("It is " + time + ". It is not time to eat yet " + firstName);
        }

    }

    public void playing(){
        isPlaying= true;
        System.out.println(firstName + " is playing ...");
    }

    public void working( String day, double time, boolean isHealthy){
        if(age >= 18 && age < 65){
            if(day != "Saturday" && day != "Sunday"){
                if( time >= 8 && time < 18){
                    if(isHealthy){
                        System.out.println(firstName + " is working...");
                    } else {
                        System.out.println(firstName + " is not feeling well, so is not working...");
                    }
                } else{
                    System.out.println(firstName + " is not working");
                }
            } else {
                System.out.println(firstName + " is not working because is weekend");
            }
        } else {
            System.out.println(firstName + " is not working...out of age range to work.");
        }
    }

    public void sleeping(double time){
        isSleeping = true;
        if(time >= 6 && time <= 20 ){
            System.out.println(firstName + " is awake...");
        }
        else {
            System.out.println(firstName + " is sleeping now...");
        }

    }

    public int birthday(int years){
        age += years;
        System.out.println(firstName + " is " + age + " years old");
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public boolean isSleeping() {
        return isSleeping;
    }
}
