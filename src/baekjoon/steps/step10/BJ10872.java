package baekjoon.steps.step10;

import java.util.Scanner;

public class BJ10872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(factorial(N));

        sc.close();

    }

    public static int factorial(int n) {

        if(n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
}
