package algorithm.array;

import java.util.Scanner;

public class Array_5 {
    /**
     * @Author : ha
     * @ClassName : Array_5
     * @Date : 2021-10-17
     * @ 자연수 N 입력되면 1부터 N까지의 소수의 개수를 출력해라 (에라토스테네스 체 )
     **/

    public int solution(int n) {

        int result = 0;

        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                result++;
            }
            for (int j = i; j <= n; j = j + i) {
                arr[j]=1;
            }
        }
        return result;
    }

//    public String solution1(int n) {
//        String result ="";
//        for (int i = 2; i <= n; i++) {
//            for (int j = i; j <= n; j = j + i) {
//            }
//        }
//        return  result;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Array_5 a = new Array_5();

        System.out.println(a.solution(n));
    }
}
