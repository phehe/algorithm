package algorithm.dfs;

public class DFS_3 {

    static int n;
    static int[] arr;

    public void DFS(int n) {
        if (n == DFS_3.n + 1) {
            String tmp = "";
            for (int i = 1; i <= DFS_3.n; i++) {
                if (arr[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            arr[n] = 1;
            DFS(n + 1);
            arr[n] = 0;
            DFS(n + 1);
        }
    }

    public static void main(String[] args) {
        n = 3;
        arr = new int[n + 1];

        DFS_3 df = new DFS_3();
        df.DFS(1);
    }

}
