package day37_Inheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone(String model, String size, double price) {
        super("Apple", model, size, price);
    }

    public void faceTime(long PhoneNumber){
        System.out.println(brand + " "+ " is having a Facetime with phone number: " + PhoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " "+ " is having a Facetime with email: " + email);
    }


}
