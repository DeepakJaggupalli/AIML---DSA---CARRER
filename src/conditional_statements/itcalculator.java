package conditional_statements;

import java.util.Scanner;

public class itcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        if(income<500000) {
            System.out.println("0% TAX");}
        else if (income>500000 && income<100000) {
            System.out.println("20% TAX");}
        else {
            System.out.println("30% TAX");
        }
    }
}
