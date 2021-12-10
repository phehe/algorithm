package algorithm.bfs;

import java.util.Scanner;
/*
*   순서
*   위치
*   탐색
*   판때기 생각
* */
public class BFS_6 {
    static int[] x = {-1, 0, 1, 0};
    static int[] y = {0, 1, 0, -1};
    static int[][] board;
    static int result = 0;

    public void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            result++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + BFS_6.x[i];
                int ny = y + BFS_6.y[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        board = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;

        BFS_6 bfs = new BFS_6();
        bfs.DFS(1, 1);

        System.out.print(result);
    }
}