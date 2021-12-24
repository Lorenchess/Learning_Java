package Poymorphism_Linkedin_Challenge;

public class Main {
    public static void main(String[] args) {
      Contact contact1 = new Contact("Ramon Lorente", new PhoneNumber("19563362323"), "ramon@google.com");
      Contact contact2 = new Contact("Isandra Blanco", "isandra@google.com");
      Contact contact3 = new Contact("Michael Lorente", new PhoneNumber("15553330000"));

      contact1.printContact();
      contact2.printContact();
      contact3.printContact();


//        System.out.println(contact1);
//        System.out.println(contact2);
//        System.out.println(contact3);



    }

}
