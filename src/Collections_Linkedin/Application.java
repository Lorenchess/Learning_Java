package Collections_Linkedin;

import java.util.Collection;
import java.util.List;

public class Application {

    //Collection groups together into a single object(data and behavior)and provides common operations(data
    // structures && algorithms) for working with the group.

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room piccadilly = new Room("Piccadilly", "Guest room", 3, 125.0);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        //Managing our Objects together in a group using Collection ...

        Collection<Room> rooms = List.of(cambridge, manchester, piccadilly, oxford);

        double total = getPotentialRevenue(rooms);
        System.out.println(total); //775
    }

    private static double getPotentialRevenue(Collection<Room> rooms) {
        return rooms.stream().mapToDouble(r -> r.getRate()).sum();
    }

}
