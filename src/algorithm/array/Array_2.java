package algorithm.array;

import java.util.Scanner;

public class Array_2 {
    /**
     *  @Author : ha
     *  @ClassName : Array_2
     *  @Date : 2021-10-17
     *  @ 키 순서대로 정렬 -> 앞 자리 사람 보다 작으면 x
    **/

    public int solution(int n, int[] arr) {
        int result =1;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                result++;
                max = arr[i];
            }
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Array_2 a = new Array_2();

        System.out.println(a.solution(n, arr));

    }
}
