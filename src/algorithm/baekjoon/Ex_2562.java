package algorithm.baekjoon;

import java.util.Scanner;

public class Ex_2562 {
    /**
     * @Author : ha
     * @ClassName : Ex_2562
     * @Date : 2021-10-09
     * @9개의 서로 다른 자연수 -> 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지 구해라;
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        int cnt = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
        for (int i = 0; i <arr.length; i++) {
            if (max == arr[i]) {
                System.out.println(i+1);
            }
        }

        // arr[] -9개 들옴
    }
}
