package day37_Inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia( String model, String size, double price){
        super("Nokia", model, size, price);
    }

    public void selfDefense(){
        System.out.println("You can use" + brand + " as self defense tool");
    }
}
