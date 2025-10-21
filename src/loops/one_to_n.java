package loops;

import java.util.Scanner;

public class one_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start =1;
        int nth_number = sc.nextInt();
        while(start<=nth_number){
            System.out.println(start +" ");
            start++;}
        System.out.println();
        }
}
