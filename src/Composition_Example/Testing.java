package Composition_Example;

public class Testing {
    public static void main(String[] args) {
        Mami isandra = new Mami();
        Papi ramon = new Papi();
        Tio oniel = new Tio();


        Michael michael = new Michael("Michael",isandra);
        Michael michael1 = new Michael("Michael",ramon);
        Michael michael2 = new Michael("Michael",oniel);

      michael.iLike();
      //Developer? I am not good at it
        // I like medicine!!
        //I do not like buildings

      michael1.iLike();
      //Medicine? I am not good at it
        // I love programming!!
        //Building stuff is interesting

     michael2.iLike();
     //I do not like medicine
        //I do not like coding
      //I love build stuff!!
    }
}
