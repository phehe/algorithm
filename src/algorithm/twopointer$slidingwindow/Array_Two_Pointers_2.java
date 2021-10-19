package algorithm.twopointer$slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_Two_Pointers_2 {
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


        while (p1 < n1 && p2 < n2) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        result.add(arr1[i]);
                    }
                }
            }
            break;
        }
        Collections.sort(result);
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
        Array_Two_Pointers_2 ap = new Array_Two_Pointers_2();

        for (int list : ap.solution(n1, n2, arr1, arr2)) {
            System.out.print(list +" ");
        }


    }
}
