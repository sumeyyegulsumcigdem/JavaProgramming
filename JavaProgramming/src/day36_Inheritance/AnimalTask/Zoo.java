package day36_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "small", "black");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', "small","brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();
        cat.meow();


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher", "Bengal", 'M', "large", "black");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);
        System.out.println(cat);
        System.out.println(dog);

    }
}
