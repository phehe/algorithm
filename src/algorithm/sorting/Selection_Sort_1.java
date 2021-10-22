package algorithm.sorting;

import java.util.Scanner;

public class Selection_Sort_1 {
    /**
     * @Author : ha
     * @ClassName : Selection_Sort_1
     * @Date : 2021-10-22
     * @ 단순선택정렬  -> 아직 정렬하지 않은 부분에서 가장 작은 값(키) 선택 ->  키 값과 정렬하지 않은 부분의 첫 번째 요소 교환.
     * 선택, 교환, 삽입
     * <p>
     * 6
     * 13 5 11 7 23 15   -> 오름차순으로
     **/

    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
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

        Selection_Sort_1 ss = new Selection_Sort_1();

        for (int result : ss.solution(n, arr)) {
            System.out.print(result+" ");
        }
    }
}
