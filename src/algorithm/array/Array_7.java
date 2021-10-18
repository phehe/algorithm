package algorithm.array;

import java.util.Scanner;

public class Array_7 {
    /**
     *  @Author : ha
     *  @ClassName : Array_7
     *  @Date : 2021-10-18
     *  @ 시험 점수 입력  -> 총 점수 출력 -> 맞으면 1  틀리면 0 -> 연속 으로 111 있으면 3점
     **/


    public int solution(int n, int[] arr){

        int result=0;
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++; // result  1 0 1 1 1 0 0 1 1 0
                result+=cnt;
            } else {
                cnt=0;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Array_7 s = new Array_7();
        System.out.println(s.solution(n, arr));
    }

}
