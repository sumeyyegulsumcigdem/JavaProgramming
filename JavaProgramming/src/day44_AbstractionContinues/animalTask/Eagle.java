package day44_AbstractionContinues.animalTask;

public class Eagle extends Animal implements WildAnimal, Flyable{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " eats snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts snake");
    }


    @Override
    public void fly() {
        System.out.println(getName() + " can fly ");
    }
}
