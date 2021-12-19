package algorithm.dfs;

import java.util.Scanner;

class DFS_15$ {

    static int a, b;
    static int[] board;

    public void DFS(int num, int so) {
        if (num == b) {
            for (int x : board) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = so; i <= a; i++) {
                board[num] = i;
                DFS(num + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        board = new int[b];

        DFS_15$ dfs = new DFS_15$();
        dfs.DFS(0, 1);
    }
}