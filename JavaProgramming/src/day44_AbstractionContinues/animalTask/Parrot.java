package day44_AbstractionContinues.animalTask;

public class Parrot extends Animal implements Playable, Flyable {


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " eats chocolate");
    }

    public void play(){

    }

    public void fly(){
        System.out.println(getName()+ " can fly 20 km/h");
    }

}
