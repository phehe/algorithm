package algorithm.dfs;

public class DFS_17$ {
    static int num;
    static int[] bar;

    public void DFS(int n) {
        if (n == DFS_17$.num + 1) {
            String tmp = " ";
            for (int i = 1; i <= DFS_17$.num; i++) {
                if (bar[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            bar[n] = 1;
            DFS(n + 1);
            bar[n] = 0;
            DFS(n + 1);
        }
    }

    public static void main(String[] args) {
        num = 10;
        bar = new int[num + 1];

        DFS_17$ dfs = new DFS_17$();
        dfs.DFS(1);
    }

}
