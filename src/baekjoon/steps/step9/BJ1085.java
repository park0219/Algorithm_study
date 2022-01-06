package baekjoon.steps.step9;

import java.util.Scanner;

public class BJ1085 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minX = Math.min(x, w - x);
        int minY = Math.min(y, h - y);

        System.out.println(Math.min(minX, minY));

        sc.close();

    }
}
