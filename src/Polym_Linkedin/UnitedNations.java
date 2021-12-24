package Polym_Linkedin;

import java.util.List;

public class UnitedNations {
    public static void main(String[] args) {
//        new Country().dance();
//        new USA().dance();
//        new Cuba().dance();

        Country country = new Country();
        USA florida = new USA();
        Cuba holguin = new Cuba();

        List<Country> countries = List.of(florida, holguin, country);

        for (Country country1 : countries) {
            country1.dance();
            //We are dancing tooooo!!!!
            //We dance casino on Earth
            //Wao we are dancing!!!!
        }

    }
}
