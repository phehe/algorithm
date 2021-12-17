package algorithm.dfs;

import java.util.Scanner;

class DFS_13$ {
    int[][] box = new int[35][35];

    public int DFS(int a, int b) {
        if (box[a][b] > 0) {
            return box[a][b];
        }
        if (a == b || b == 0) {
            return 1;
        } else {
            return box[a][b] = DFS(a - 1, b - 1) + DFS(a - 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        DFS_13$ dfs = new DFS_13$();
        System.out.println(dfs.DFS(a, b));
    }
}