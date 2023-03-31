package day44_AbstractionContinues.animalTask;

public final class Cat extends Animal implements Playable {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Biryani");
    }

    public void Meow(){
        System.out.println(getName() + " is meowing");
    }

    public void play(){

    }

}
