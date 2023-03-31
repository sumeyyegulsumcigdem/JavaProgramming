package day37_Inheritance.phoneTask;

public class Samsung extends Phone{

    public Samsung( String model, String size, double price) {
       super("Samsung", model, size, price);
    }

    public void freeze(){
        System.out.println(brand+ " "+ model+ " is freezing");
    }


}
