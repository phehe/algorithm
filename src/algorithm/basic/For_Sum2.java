package algorithm.basic;

import java.util.Scanner;

public class For_Sum2 {
    // 가우스 덧셈 1~n까지 덧셈  (n+1)*n /2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = (n + 1) * n / 2;
        System.out.println(sum);


    }
}
