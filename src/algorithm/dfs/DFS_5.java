package algorithm.dfs;

class Node_4 {
    int data;
    Node_4 lt, rt;

    public Node_4(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DFS_5 {

    Node_4 root;

    public int DFS(int n, Node_4 root) {
        if (root.lt == null && root.rt == null) {
            return n;
        } else {
            return Math.min(DFS(n + 1, root.lt), DFS(n + 1, root.rt));
        }
    }

    public static void main(String args[]) {
        DFS_5 tree = new DFS_5();
        tree.root = new Node_4(1);
        tree.root.lt = new Node_4(2);
        tree.root.rt = new Node_4(3);
        tree.root.lt.lt = new Node_4(4);
        tree.root.lt.rt = new Node_4(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}