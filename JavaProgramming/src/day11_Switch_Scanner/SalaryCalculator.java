package day11_Switch_Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 35_000;
        double taxRate = 0;
        boolean isMarried = true;

        if(salary >= 130_000){
            taxRate = 0.35 ;
        }else if(salary >= 100_000){
            taxRate = 0.30;
        }else if(salary >= 80_000){
            taxRate = 0.20;
        }

        if (isMarried){
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);















    }
}
