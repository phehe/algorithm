package algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Two_Pointers_1 {
    /**
     * @Author : ha
     * @ClassName : Array_Two_Pointers_1
     * @Date : 2021-10-18
     * @ 오름차순으로 정렬이 된 두 배열 합치기
     **/

    /*
    3   n개
    1 3 5
    5   n개
    2 3 6 7 9     -> 1 2 3 3 5 6 7 9
    * */
    public ArrayList<Integer> solution(int n1, int n2, int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList();

        int p1 = 0;
        int p2 = 0;

        while (p1 < n1 && p2 < n2) {  // 두 배열 같아지면 ㅃ
            if (a[p1] < b[p2]) {
                result.add(a[p1++]);  // result에 값 추가  -> ++;
            } else {
                result.add(b[p2++]);
            }
        }
        while (p1 < n1) {
            result.add(a[p1++]);
        }
        while (p2 < n2) {
            result.add(b[p2++]);
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        Array_Two_Pointers_1 ap = new Array_Two_Pointers_1();

        for (int arr : ap.solution(n1, n2, a, b)) {
            System.out.print(arr + " ");
        }

    }

}
