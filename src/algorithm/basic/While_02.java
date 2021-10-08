package algorithm.basic;

import java.util.Scanner;

public class While_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의정수 입력하면 자릿수 알려드립니다.");
        int n;
        do {
            System.out.print("정수값: ");
            n = sc.nextInt();
        } while (n <=0);

        // n = 123

        int cnt;

        for (cnt = 0; n > 0; cnt++) {
            n /= 10;
        }
        System.out.println("입력하신 수의 자릿수는 " + cnt + "자리입니다.");

    }
}
