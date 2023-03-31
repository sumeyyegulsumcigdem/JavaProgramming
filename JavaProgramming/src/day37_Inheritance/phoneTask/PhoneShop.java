package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12", "6.7 inches", 1000);
        Samsung samsung = new Samsung("galaxy s19", "6 inches", 900);
        Nokia nokia = new Nokia("Brick", "4 inches", 50);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(12334557);
        iphone.faceTime(65904359);
        iphone.faceTime("cydeo@gmail.com");

        System.out.println("-------------------------------------------------");

        samsung.call(911);
        samsung.text(214325463);
        samsung.freeze();

        nokia.call(911);
        nokia.text(24325252);
        nokia.selfDefense();

        System.out.println("------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);



    }
}
