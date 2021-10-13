package algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_1920 {
    /**
     * @Author : ha
     * @ClassName : Ex_1920
     * @Date : 2021-10-12
     * @이분 탐색 -> B배열 요소에 A배열 요소가 있으면 1 없으면 0
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int key = 0;

        binarySearch(arr1, arr2, n, key);
    }

    static int binarySearch(int arr1[], int arr2[], int n, int key) {

        int start = 0;
        int end = n - 1;

        //arr1[] 1 2 3 4 5
        //arr2[] 5 2 4 8 6



        return 0;


    }
}
