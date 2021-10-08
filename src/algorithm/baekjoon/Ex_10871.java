package algorithm.baekjoon;

import java.util.Scanner;

public class Ex_10871 {
    /**
     * @Author : ha
     * @ClassName : Ex_10871
     * @Date : 2021-10-08
     * @ X보다 작은수 -> 정수 N개로 이루어진 수열 A / 정수 X  -> A 수열에서 X보다 작은수를 구해라
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt(); // 정수 X

        int[] a = new int[n];  // 수열 A

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (x > a[i]) {
                System.out.print(a[i]+" ");
            }
        }



    }

}
