package algorithm.twopointer$slidingwindow;

import java.util.Scanner;

public class Sliding_Window_1 {
    /**
     * @Author : ha
     * @ClassName : Sliding_Window_1
     * @Date : 2021-10-19
     * @ 최대 매출 -> N일 동안의 매출을 기록하고  연속된 K일 동안의 최대 매출액을 구해라
     * 10 3
     * 12 15 11 20 25 10 20 19 13 15   -> 11, 20, 25 -> 연속된 3일 동안의 매출이 가장 크다
     **/

    public int solution(int n, int k, int[] arr) {
        int result = 0;

        int max = 0;
        int tmp = 0;

        int p1 = 0;
        int p2 = k-1;

        while (p2 < n) {
            tmp=0;
            for (; p1<=p2; p1++) {
                tmp += arr[p1];
            }
            p1--;
            p1--;
            p2++;
            if (tmp > max) {
                max = tmp;
            }
        }
        result=max;

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

        Sliding_Window_1 s = new Sliding_Window_1();

        System.out.println(s.solution(n,k,arr));
    }
}
