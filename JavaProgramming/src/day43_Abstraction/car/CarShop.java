package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

       // Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        //We cannot create object from Abstract class, because
        //Abstract class is not concrete

       Honda honda = new Honda("Accord", "Black", 2019, 30000);

       Audi audi1 = new Audi("Q7", "Blue", 2020, 45000);

       Tesla tesla = new Tesla("Model3","White", 2021,60000);

        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi1);

        honda.setColor("Red");
        audi1.setColor("pink");
        tesla.setColor("grey");

        honda.setPrice(24000);
        audi1.setPrice(24300);

        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi1);




    }

}
