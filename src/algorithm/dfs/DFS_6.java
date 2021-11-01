package algorithm.dfs;

import java.util.Scanner;

class DFS_6 {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int n) {
        if (n == DFS_6.n) {
            answer++;
        } else {
            for (int i = 1; i <= DFS_6.n; i++) {
                if (graph[n][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;

        DFS_6 df = new DFS_6();
        df.DFS(1);
        System.out.println(answer);
    }
}