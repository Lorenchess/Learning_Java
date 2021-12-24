package MobilPhoneChallenge;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Method that calls the constructor to create a new contact record, we use "static" so we do not need to create a
    // new instance object from it.

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
