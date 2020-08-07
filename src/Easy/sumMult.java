package Easy;

import java.util.Scanner;

public class sumMult {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Introduce a number");
        int number = kbd.nextInt();
        System.out.println(sumMulti(number));;
    }

    public static int sumMulti(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0) sum += i;
            else if (i % 5 == 0) sum += i;
        }
        return sum;
    }


}
