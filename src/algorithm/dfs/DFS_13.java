package algorithm.dfs;

import java.util.Scanner;

class DFS_13 {
    int[][] arr = new int[35][35];

    public int DFS(int n, int r) {
        if (arr[n][r] > 0) {
            return arr[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return arr[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        DFS_13 dfs = new DFS_13();
        System.out.println(dfs.DFS(n, r));
    }
}