package algorithm.basic;

import java.util.Scanner;

public class MaxNum {
    /**
     * @Author : ha
     * @ClassName : MaxNum
     * @Date : 2021-10-06
     * @정수 3개 입력 -> 최대값
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        int a = sc.nextInt();

        System.out.print("두번째 숫자 입력 : ");
        int b = sc.nextInt();

        System.out.print("세번째 숫자 입력 : ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최대값 : " + max);
    }
}
