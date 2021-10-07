package algorithm.basic;

import java.util.Scanner;

public class MaxNum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max;

        System.out.print("첫번째 숫자 입력 : ");
        int a = sc.nextInt();

        System.out.print("두번째 숫자 입력 : ");
        int b = sc.nextInt();

        System.out.print("세번째 숫자 입력 : ");
        int c = sc.nextInt();
        // a 20 b10 c 5

        if (a > b) {
            max = a;
            if (a > c) {
                max = a;
            }
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("최대값 : " + max);
    }
}
