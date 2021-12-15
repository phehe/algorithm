package algorithm.dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class DFS_11$ {
    static int n, m, result = Integer.MAX_VALUE;

    public void DFS(int num, int sum, Integer[] arr) {
        if (sum > m) {
            return;
        }
        if (num >= result) {
            return;
        }
        if (sum == m) {
            result = Math.min(result, num);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(num + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();

        DFS_11$ dfs = new DFS_11$();
        dfs.DFS(0, 0, arr);
        System.out.println(result);
    }
}