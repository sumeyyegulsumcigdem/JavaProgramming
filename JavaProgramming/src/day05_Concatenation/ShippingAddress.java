package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Sümeyye Çiğdem",
                buildingNumber = "118218",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22031A";

/*

you can write like that or one by one

        String name = "Sümeyye Çiğdem";
        String buildingNumber = "118218";
        String streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "22031A";

*/

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;


    }

}
