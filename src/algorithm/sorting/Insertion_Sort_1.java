package algorithm.sorting;

import java.util.Scanner;

public class Insertion_Sort_1 {
    /**
     * @Author : ha
     * @ClassName : Insertion_Sort_1
     * @Date : 2021-10-25
     * @ N개의 숫자가 입력되면 오름차순으로 정렬하여 출력
     * <p>
     * 6
     * 11 7 5 6 10 9        -> 5 6 7 9 10 11
     **/

    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Insertion_Sort_1 T = new Insertion_Sort_1();
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
