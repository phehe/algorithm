package algorithm.array;

import java.util.Scanner;

public class Array_4 {
    /**
     *  @Author : ha
     *  @ClassName : Array_4
     *  @Date : 2021-10-17
     *  @피보나치
    **/

    public int[] solution(int n){
        int[] result = new int[n];
        result[0] =1;
        result[1] = 1;

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Array_4 w = new Array_4();
        for (int s : w.solution(n)) {
            System.out.print(s+" ");
        }
    }
}
