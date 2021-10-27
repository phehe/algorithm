package algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Sort_1 {
    /**
     * @Author : ha
     * @ClassName : BinarySearch_Sort_1
     * @Date : 2021-10-27
     * @ N개의 입력 받은 수를 오름차순으로 정렬 -> M 값이 주어지면 몇 번째에 위치하는지 출력해라.
     * <p>
     * 8 32
     * 23 87 65 12 57 32 99 81      -> 3
     **/

    public int solution(int m, int[] arr) {
        int result = 1;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (m > arr[i]) {
                result++;
            } else {
                return result;
            }
        }

        return result;
    }

    public int solution2(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BinarySearch_Sort_1 bs = new BinarySearch_Sort_1();
        System.out.println(bs.solution(m, arr));
    }
}
