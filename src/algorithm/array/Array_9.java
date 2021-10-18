package algorithm.array;

import java.util.Scanner;

public class Array_9 {
    /**
     * @Author : ha
     * @ClassName : Array_9
     * @Date : 2021-10-18
     * @ N*N 격자판 -> 각 행, 각 열의 합 중 가장 큰 합을 출력
     **/

    public int solution(int n, int[][] arr) {
        int result = 0;

        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];  // 행 합
                sum2 += arr[j][i];  // 열 합
            }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }
        sum1=sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);


        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Array_9 s = new Array_9();
        System.out.println(s.solution(n,arr));


    }
}
