package algorithm.twopointer$slidingwindow;

import java.util.Scanner;

public class Sliding_Window_2 {
    /**
     * @Author : ha
     * @ClassName : Sliding_Window_2
     * @Date : 2021-10-19
     * @ 연속 부분 수열
     * n개의 수로 이루어진 수열 -> 연속부분수열의 합이 m이 되는 경우의 수를 구해라
     * 8 6   개수/합
     * 1 2 1 3 1 1 1 2     ->3개의 경우  {2,1,3}, {1,3,1,1}, {3,1,1,1}
     **/


    public int solution(int n, int m, int[] arr) {
        int result = 0;

        int sum = 0;

        int p1 = 0;
        int p2 = 0;
        int cnt = 0;

        while (p2 < n) {
            sum += arr[p2];
            if (m >sum) {  // 6>sum
                p2++;
            } else if (sum > m) {
                p1++;
                p2=p1;
                sum=0;
            } else if (sum == m) {
                cnt++;
                p1++;
                p2 = p1;
                sum = 0;
            }
        }
        result = cnt;


        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Sliding_Window_2 as = new Sliding_Window_2();

        System.out.println(as.solution(n, m, arr));

    }
}
