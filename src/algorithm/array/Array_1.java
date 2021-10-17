package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_1 {
    /**
     *  @Author : ha
     *  @ClassName : Array_1
     *  @Date : 2021-10-17
     *  @ n개의 정수 입력 받고 자신의 바로 앞 수 보다 크면 출력
    **/
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                result.add(arr[i]);
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

        Array_1 a = new Array_1();

        for (int i : a.solution(n, arr)) {
            System.out.print(i+" ");
        }
    }

}

