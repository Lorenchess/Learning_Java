package Interfaces;

public class Main {
    public static void main(String[] args) {
      ITelephone ramonPhone;
      ramonPhone = new DeskPhone(12345);
      ramonPhone.powerOn();
      ramonPhone.callPhone(12345);
      ramonPhone.answer();

      ramonPhone = new MobilPhone(23456);
      ramonPhone.powerOn();
      ramonPhone.callPhone(23456);
      ramonPhone.answer();
    }
}
