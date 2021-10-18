package algorithm.array;

import java.util.Scanner;

public class Array_8 {
    /**
     *  @Author : ha
     *  @ClassName : Array_8
     *  @Date : 2021-10-18
     *  @ 등수 구하기 -> 가장 높은 점수 92점이 3명이면 3명다 1등 나머지 4등부터
    **/
    
    public int[] solution(int n, int[] arr) {
        int[] result = new int[n];
        int[] arr2 = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] < arr2[j]) {  //5 92 89 92 100 76   arr[i]
                    cnt++;                  // 92 89 92 100 76   re[j]
                }
            }
            result[i] = cnt;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Array_8 a = new Array_8();
        for (int i : a.solution(n, arr)) {
            System.out.print(i+" ");
        }

    }
}
