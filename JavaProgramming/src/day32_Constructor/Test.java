package day32_Constructor;

public class Test {

    public Test(){
        System.out.println("A");
    }

    public Test(int a){ //A  B
        this();
        System.out.println("B");
    }

    public Test(double a){ // A B C
        this(10);
        System.out.println("C");
    }

    public Test(String str){ // A B C D
        this(2.4);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test(10);
    }

}
