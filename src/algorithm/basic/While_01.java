package algorithm.basic;

import java.util.Scanner;

public class While_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("a의 값 : ");
            int a = sc.nextInt();

            System.out.print("b의 값 : ");
            int b = sc.nextInt();

            if (a >= b) {
                while (true) {
                    System.out.println("a보다 큰 값을 입력하세요.");
                    System.out.print("b의 값 : ");
                    b = sc.nextInt();
                    if (b > a) {
                        break;
                    }
                }
            }
            System.out.println("b-a는" + (b - a) + "입니다");
            break;
        }


    }
}
