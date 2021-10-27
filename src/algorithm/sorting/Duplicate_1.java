package algorithm.sorting;

import java.util.Scanner;

public class Duplicate_1 {
    /**
     * @Author : ha
     * @ClassName : Duplicate_1
     * @Date : 2021-10-27
     * @ n명의 학생들이 적어낸 숫자에 중복이 있으면 D 없으면 U 출력
     * <p>
     * 8
     * 20 25 52 30 39 33 43 33      -> D
     **/

    public String solution(int n, int[] arr) {
        String result = "U";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return "D";
                }
            }
        }
        return result;
    }

    public String solution2(int n, int[] arr) {
        String result = "U";

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = "D";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Duplicate_1 dp = new Duplicate_1();
        System.out.println(dp.solution(n, arr));

    }
}
