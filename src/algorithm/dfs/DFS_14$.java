package algorithm.dfs;

import java.util.Scanner;

class DFS_14$ {
    static int[] ba, pa, ca;
    static int a, b;
    boolean flag = false;
    int[][] var = new int[35][35];

    public int com(int n, int r) {
        if (var[n][r] > 0) {
            return var[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return var[n][r] = com(n - 1, r - 1) + com(n - 1, r);
        }
    }

    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == a) {
            if (sum == b) {
                for (int x : pa) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= a; i++) {
                if (ca[i] == 0) {
                    ca[i] = 1;
                    pa[L] = i;
                    DFS(L + 1, sum + (pa[L] * ba[L]));
                    ca[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        ba = new int[a];
        pa = new int[a];
        ca = new int[a + 1];

        DFS_14$ d = new DFS_14$();

        for (int i = 0; i < a; i++) {
            ba[i] = d.com(a - 1, i);
        }

        d.DFS(0, 0);
    }
}