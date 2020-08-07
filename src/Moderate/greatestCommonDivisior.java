package Moderate;

import java.util.Scanner;

public class greatestCommonDivisior {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Introduce a number");
        int p = kbd.nextInt();

        System.out.println("Introduce a second number");
        int d = kbd.nextInt();

        System.out.println(gcm(d,p));;
    }

    public static int gcm(int p, int d){
        int gcm = 0;
        int biggest = p > d =
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0) sum += i;
            else if (i % 5 == 0) sum += i;
        }
        return sum;
    }
}
