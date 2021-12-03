package algorithm.dfs;

import java.util.Scanner;

class DFS_15 {
    static int[] arr;
    static int n, m;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                arr[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];

        DFS_15 T = new DFS_15();
        T.DFS(0, 1);
    }
}