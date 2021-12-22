package algorithm.dfs;

import java.util.Scanner;

class DFS_12$ {
    static int[] p, c, arr;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int x : p) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (c[i] == 0) {
                    c[i] = 1;
                    p[L] = arr[i];
                    DFS(L + 1);
                    c[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        c = new int[n];
        p = new int[m];

        DFS_12$ df = new DFS_12$();
        df.DFS(0);
    }
}