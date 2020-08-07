package Moderate;

import java.util.Scanner;

public class EvenFibonacciSum {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Introduce a number");
        int number = kbd.nextInt();
        System.out.println(sumFibonacci(number));;
    }

    public static int sumFibonacci(int number){
        int previous_fibo = 0;
        int actual_fibo = 1;
        int fibo_temp = 0;
        int sumFibo = 0;
        do{
            if (actual_fibo % 2==0){
                sumFibo += actual_fibo;
            }
                fibo_temp = actual_fibo;
                actual_fibo = previous_fibo + actual_fibo;
                previous_fibo = fibo_temp;

        } while (actual_fibo <= number);
        return sumFibo;
    }

}
