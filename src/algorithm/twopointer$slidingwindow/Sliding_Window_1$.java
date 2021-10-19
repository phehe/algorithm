package algorithm.twopointer$slidingwindow;

import java.util.Scanner;

public class Sliding_Window_1$ {
    /**
     * @Author : ha
     * @ClassName : Sliding_Window_1
     * @Date : 2021-10-19
     * @ 최대 매출 -> N일 동안의 매출을 기록하고  연속된 K일 동안의 최대 매출액을 구해라
     * 10 3
     * 12 15 11 20 25 10 20 19 13 15   -> 11, 20, 25 -> 연속된 3일 동안의 매출이 가장 크다
     *
     * k 길이 만큼의 값 구하고 -> 쭉 민다 sum + 다음값 - 첫번재 값
     **/

    public int solution(int n, int k, int[] arr) {
        int result = 0;
        int sum =0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
            result=sum;
        }
        for (int i = k; i < n; i++) {
            sum = sum + (arr[i]) - arr[i - k];
            result = Math.max(result, sum);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sliding_Window_1$ s = new Sliding_Window_1$();

        System.out.println(s.solution(n,k,arr));
    }
}
