package Poymorphism_Linkedin_Challenge;

public class Contact {
    private String name;
    private PhoneNumber phoneNumber;
    private String email;

    public Contact(String name, PhoneNumber phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contact(String name, PhoneNumber phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void printContact(){
        System.out.println("Contact information: " + name + ", " + phoneNumber + ", " + email);
    }


    public void printContact(String name, PhoneNumber phoneNumber){
        System.out.println("Contact information: " + name + ", " + phoneNumber);
    }

    public void printContact(String name, String email){
        System.out.println("Contact information: " + name + ", " + email);
    }



    public String getName() {
        return name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
