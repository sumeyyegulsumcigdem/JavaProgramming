package day44_AbstractionContinues.animalTask;

public class Dog extends Animal{


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Pizza");
    }

    public void bark(){
        System.out.println(getName()+ " is barking");
    }

}
