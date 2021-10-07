package algorithm.basic;

import java.util.Scanner;

public class MaxNum4 {

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        int a = sc.nextInt();

        System.out.print("두번째 숫자 입력 : ");
        int b = sc.nextInt();

        System.out.print("세번째 숫자 입력 : ");
        int c = sc.nextInt();

        System.out.print("네번째 숫자 입력 : ");
        int d = sc.nextInt();

        System.out.println("최대값="+max4(a, b, c, d));
    }
}
