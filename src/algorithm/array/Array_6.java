package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_6 {
    /**
     * @Author : ha
     * @ClassName : Array_6
     * @Date : 2021-10-18
     * @ N 개수 입력 받아 N개의 정수 입력 - > 숫자를 뒤집고 뒤집은 숫자가 소수인지 아닌지 판별
     **/

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i]; // 321
            int res = 0;
            while (0 < tmp) {
                int t = tmp % 10; // 나머지
                res = res * 10 + t; // 뒤집
                tmp = tmp / 10; // 계속할꺼
            }
            if (isPrime(res)) {
                result.add(res);
            }
        }
        return result;
    }

    private boolean isPrime(int res) {
        if (res == 1) {
            return false;
        }
        for (int i = 2; i < res; i++) {
            if (res % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Array_6 a = new Array_6();

        for (int x : a.solution(n, arr)) {
            System.out.print(x+" ");
        }

    }

}
