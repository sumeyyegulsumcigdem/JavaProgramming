package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_AbstractionContinues.animalTask.Animal;
import day44_AbstractionContinues.animalTask.Cat;
import day44_AbstractionContinues.animalTask.Dog;
import day45_Abstraction.Circle;
import day45_Abstraction.Shape;
import day45_Abstraction.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {


        //  Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        //WebDriver driver = (ChromeDriver) new ChromeDriver();

        // Dog dog2 = new Dog("Lucy", "Husky", 'M', 3, "Small", "White");

        //  Dog dog3 = dog2;

        //Kendi türünde olduğu için hemen dönüşüyor
        //Kendi türü olmadığı için casting gerekiyor

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog) animal; //Downcasting

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        // animal.bark();

        ((Dog) animal).bark();

        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());

        System.out.println("-----------------------------------");

        Animal animal2 = new Cat("Fındıx", "Smokin", 'M', 2, "big", "White");

        //  Cat cat = (Cat) animal2;
        //   cat.Meow();

        ((Cat) animal2).Meow();

        // ((Dog) animal2).bark();

        System.out.println("-----------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "SDET", 13000);

        ((Tester) employee).bugReport();

        // ((Tester) employee).unitTest();

        //  Driver driver = (Driver) employee;    //line1 - ClassCastException
        Person person = (Person) employee;    //line2 - ClassCastException
        //  Teacher teacher = (Teacher) employee; //line3 - ClassCastException

        System.out.println("-----------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();


    }
}
