package algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_3273 {
    /**
     * @Author : ha
     * @ClassName : Ex_3273
     * @Date : 2021-10-19
     * @두 수의 합 N 개의 서로 다른 양수로 이루어진 수열  자연수 X가 주어졌을 때 a+b =X 를 만족하는 경우의 수
     * 9     -> n
     * 5 12 7 10 9 1 2 3 11       (a,b) 두 쌍 으로만 이루어진거
     * 13    -> x 합        -> 3 개
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int cnt = 0;
        int sum = 0;
        int p1 = 0;

        while (p1 < n) {
            sum = 0;
            for (int p2 = p1; p2 < n; p2++) {
                sum += arr[p2];
                if (sum == x) {
                    cnt++;
                }
                while (sum >n) {
                    sum -= arr[p2];
                }
            }
            p1++;
        }

        System.out.println(cnt);

    }
}
