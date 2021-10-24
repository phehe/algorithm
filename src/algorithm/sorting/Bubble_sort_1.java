package algorithm.sorting;

import java.util.Scanner;

public class Bubble_sort_1 {
    /**
     * @Author : ha
     * @ClassName : Bubble_sort_1
     * @Date : 2021-10-23
     * @ 인접한 두 수를 비교해서 오름차순으로 정렬
     * <p>
     * 6
     * 13 5 11 7 23 15
     **/

    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n - 1; i++) {     // 교환 횟수
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
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

        Bubble_sort_1 bs = new Bubble_sort_1();

        for (int result : bs.solution(n, arr)) {
            System.out.print(result + " ");
        }

    }
}
