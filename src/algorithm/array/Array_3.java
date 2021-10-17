package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_3 {
    /**
     *  @Author : ha
     *  @ClassName : Array_3
     *  @Date : 2021-10-17
     *  @ 가위바위보 -> 가위 1 / 바위 2 / 보 3 -> 비기면 D
    **/

    public String solution(int n, int[] a, int[] b){
        String result = "";

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                result+="D";
            } else if (a[i] == 1 && b[i] == 3) {
                result += "A";
            } else if (a[i] == 2 && b[i] == 1) {
                result += "A";
            } else if (a[i] == 3 && b[i] == 2) {
                result += "A";
            } else{
                result += "B";
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Array_3 q = new Array_3();

        System.out.println(q.solution(n, a, b));
    }
}
