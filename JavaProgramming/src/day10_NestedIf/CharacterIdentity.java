package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {

/* write a program that can identify if the given character is a digit or

Ex:

ch = '@'

output:
Special Character


 */

        char ch = 65;

        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabetic");
        } else {
            System.out.println("Special Character");
        }









    }
}
