package algorithm.array;

import java.util.Scanner;

public class Array_05 {
    /**
     * @Author : ha
     * @ClassName : Array_05
     * @Date : 2021-10-08
     * @배열 b의 모든 요소를 배열 a에 복사 copy 메소드
     **/

    static void copy(int[] a, int[] b) {

        a = b.clone();

        System.out.print("a 배열의 요솟값 : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nb 배열의 요솟값 : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    static void copyReverse(int[] a, int[] b) {
        a = b.clone();
        int tmp;
        for (int i = 0; i < a.length / 2; i++) {
            tmp = a[i];
            a[i] = a[a.length - i-1];
            a[a.length - i-1] = tmp;
        }

        System.out.println();
        for (int i : a) {
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        copy(a, b);
        copyReverse(a, b);

    }


}
