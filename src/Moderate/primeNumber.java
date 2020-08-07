package Moderate;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Introduce a number");
        int number = kbd.nextInt();
        System.out.println("Is prime:");
        System.out.println(isprime(number));;
    }

    public static boolean isprime(int number){
        boolean  isprime_flag= true;
        for (int i = number-1; i > 1; i--) {
            if(number%i == 0){
                isprime_flag = false;
                break;
            }
        }
        return isprime_flag;
    }
}
