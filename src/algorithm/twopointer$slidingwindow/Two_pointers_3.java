package algorithm.twopointer$slidingwindow;

import java.util.Scanner;

public class Two_pointers_3 {
    /**
     * @Author : ha
     * @ClassName : Two_pointers_3
     * @Date : 2021-10-19
     * @ 연속된 자연수의 합 -> N = 15  2개 이상의 자연수의 합이 N이 되는 경우의 수를 구해라
     * <p>
     * 15   ->N       (n/2+1 까지 기억)  -> 배열방
     * 7+8=15
     * 4+5+6 =15
     * 1+2+3+4+5=15   -> 3가지
     **/

    public int solution(int n, int[] arr) {
        int result=0;
        int lt =0;
        int sum=0;
        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if (sum == n) {
                result++;
            }
            while (sum >= n) {
                sum = sum - arr[lt++];
                if (sum == n) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n / 2 + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        Two_pointers_3 ts = new Two_pointers_3();

        System.out.println(ts.solution(n,arr));

    }

}
