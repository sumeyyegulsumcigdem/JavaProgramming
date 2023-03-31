package day46_Polymorphism;


import day44_AbstractionContinues.animalTask.Animal;
import day44_AbstractionContinues.animalTask.Cat;
import day44_AbstractionContinues.animalTask.Dog;
import day45_Abstraction.*;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double b2 = 5.5;

        Boolean r1 = true;

        Object[] array = {str, n1, b2, r1};

        // WebDriver driver1 = new ChromeDriver();
        // WebDriver driver2 = new ChromeDriver();

        String string = "Java";

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal.drink();
        animal.eat();
        // animal.play();
        // animal.bark();

        Animal animal3 = new Cat("Fındık", "Smokin", 'M', 2, "miniş", "white");

        Shape shape = new Circle(3);
        shape.area();

        //  System.out.println(shape.getRadius());
        //  System.out.println(shape.PI);

        boolean isSquare = shape instanceof Square;
        boolean isRectanlge = shape instanceof Rectangle;
        boolean isTriange = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectanlge = " + isRectanlge);
        System.out.println("isTriange = " + isTriange);
        System.out.println("isCircle = " + isCircle);
    }

}
