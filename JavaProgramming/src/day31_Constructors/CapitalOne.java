package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Adam Smith", 123456789);

        System.out.println(account1);
        account1.deposit(10000);
        account1.checkBalance();

        account1.withdraw(850);
        account1.checkBalance();

        account1.deposit(200);
        account1.checkBalance();

        System.out.println("----------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Jack", 12324325);

        account2.deposit(10000);

        account2.checkBalance();












    }
}
