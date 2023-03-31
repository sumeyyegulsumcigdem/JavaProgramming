package day37_Inheritance.phoneTask;

public class Phone {

    //hepsini instance yapıyoruz, not static. yoksa hepsi aynı
    //marka, model fiyat olur

    public String brand;
    public String model;
    public String size;
    public double price;

    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
    }

    static {
        hasBattery = true;
    }

    public void call(long PhoneNumber){
        System.out.println(brand + " " + " is calling " + PhoneNumber);
    }

    public void text(long PhoneNumber){
        System.out.println(brand+ " "+ " is texting "+ PhoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

}

