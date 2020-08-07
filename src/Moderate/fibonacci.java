package Moderate;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Introduce a number");
        int number = kbd.nextInt();
        System.out.println(fibonacci(number));;
    }

    public static int fibonacci(int number){
        int previous_fibo    = 0;
        int actual_fibo = 1;
        int fibo_temp = 0;
        for (int i = 0; i < number; i++) {
            if (number == 0)
                return previous_fibo;
            else if (number == 1)
                return actual_fibo;
            else
                fibo_temp = actual_fibo;
                actual_fibo = previous_fibo + actual_fibo;
                 previous_fibo = fibo_temp;
        }
        return actual_fibo;
    }
}
