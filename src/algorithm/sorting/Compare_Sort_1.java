package algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Compare_Sort_1 {
    /**
     * @Author : ha
     * @ClassName : Compare_Sort_1
     * @Date : 2021-10-27
     * @ 키 순으로 비교해서 몇번째인지 번호 출력
     * <p>
     * 9
     * 120 125 152 130 135 135 143 127 160      -> 3 8
     **/

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] clone = arr.clone();
        Arrays.sort(clone);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != clone[i]) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Compare_Sort_1 cp = new Compare_Sort_1();

        for (int c : cp.solution(n, arr)) {
            System.out.print(c+" ");
        }

    }
}
