package algorithm.twopointer$slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Two_Pointers_2$ {
    /**
     * @Author : ha
     * @ClassName : Array_Two_Pointers_2
     * @Date : 2021-10-19
     * @ A,B 두 집합의 공통 원소를 오름차순으로 정렬해서 출력
     * 5
     * 1 3 9 5 2
     * 5
     * 3 2 5 7 8   -> 2 3 5
     **/

    public ArrayList<Integer> solution(int n1, int n2, int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < n1 && p2 < n2) {
            if (arr1[p1] == arr2[p2]) {
                result.add(arr1[p1]);
                p1++;
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }


        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        Array_Two_Pointers_2$ ap = new Array_Two_Pointers_2$();

        for (int list : ap.solution(n1, n2, arr1, arr2)) {
            System.out.print(list + " ");
        }


    }
}
