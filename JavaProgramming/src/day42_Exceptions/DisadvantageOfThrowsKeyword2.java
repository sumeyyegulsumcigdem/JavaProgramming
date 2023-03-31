package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) {
     /*
        method1();
        method2();
        method3();
        method4();

      */
    }

    public static void method1(){
        try {
            new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void method2() throws FileNotFoundException{
        method1();
    }

    public static void method3() throws FileNotFoundException, InterruptedException{
        method2();
        Thread.sleep(1000);
    }

    public static void method4() throws FileNotFoundException, InterruptedException {
        method3();
    }
}
