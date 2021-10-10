package algorithm.baekjoon;

import java.util.Scanner;

public class Ex_2577$$ {
    /**
     *  @Author : ha
     *  @ClassName : Ex_2577$$
     *  @Date : 2021-10-10
     *  @ .... 돌 대 가 리
    **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[10];
        int n = a * b * c;

        while (n > 0) {
            arr[n % 10]++;
            n/=10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
    
}
