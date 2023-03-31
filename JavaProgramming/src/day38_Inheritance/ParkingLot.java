package day38_Inheritance;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota =new Toyota("Corolla", 2020, 200000, "gray", 100);

        Tesla tesla = new Tesla("Model S", 2021, 200000, "black", 2000);

        BMW bmw = new BMW("XS", 2020, 565734,"white", 1030);

        toyota.start();
        tesla.start();
        bmw.start();
    }
}
