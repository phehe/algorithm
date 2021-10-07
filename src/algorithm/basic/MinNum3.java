package algorithm.basic;

import java.util.Scanner;

public class MinNum3 {

    static int min3(int a, int b, int c) {
        int min=a ;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min =c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a값:");
        int a = sc.nextInt();

        System.out.print("b값:");
        int b = sc.nextInt();

        System.out.print("c값:");
        int c = sc.nextInt();

        System.out.println("최소값:" + min3(a, b, c));

    }
}
