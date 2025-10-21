package conditional_statements;

import java.util.Scanner;

public class adult_teen {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("child");}
            else if (age>=18 && age<=50) {
                System.out.println("youth");}
                else {
                    System.out.println("musiliodu");
            }
        }
    }