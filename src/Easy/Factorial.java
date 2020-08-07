package Easy;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Introduce a number");
        int number = kbd.nextInt();
        System.out.println("Factorial: ");
        System.out.println(factorial(number));;
    }

    public static int factorial(int number){
        int facto = 1;
        for (int i = number; i > 0; i--) {
            facto = i*facto;
        }
        return facto;
    }

}
