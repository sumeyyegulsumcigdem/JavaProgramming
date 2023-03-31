package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempts = 3; //3,2,1, if credentials are not valid

            while( !(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0){ // while the credentials are invalid, and user has attempt to re enter

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();
                attempts--;

                if(attempts == 1){
                    System.out.println("This is your last chance");
                }
            }

            if(u.equals("Cydeo") && p.equals("Cydeo123")){ // if credentials are valid
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");

            }
        }

scan.close();







    }
}
