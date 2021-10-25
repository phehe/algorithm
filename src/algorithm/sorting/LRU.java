package algorithm.sorting;

import java.util.Scanner;

public class LRU {
    /**
     *  @Author : ha
     *  @ClassName : LRU
     *  @Date : 2021-10-25
     *  @ 캐시메모리 -> LRU 가장 최근에 사용하지 않은 페이지 삭제
     *
     *  5 9
     * 1 2 3 2 6 2 3 5 7        -> 7 5 3 2 6
    **/

    public int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];

        for (int c : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (c == cache[i]) pos = i;
            }
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = c;
        }
        return cache;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LRU l = new LRU();
        for (int x : l.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
