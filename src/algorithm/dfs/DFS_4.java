package algorithm.dfs;

import java.util.LinkedList;
import java.util.Queue;

class Node_3 {
    int data;
    Node_3 lt, rt;

    public Node_3(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DFS_4 {

    Node_3 root;

    public void BFS(Node_3 root) {
        Queue<Node_3> Q = new LinkedList<>();
        Q.add(root);
        int n = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(n + " : ");
            for (int i = 0; i < len; i++) {
                Node_3 cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    Q.add(cur.lt);
                }
                if (cur.rt != null) {
                    Q.add(cur.rt);
                }
            }
            n++;
            System.out.println();
        }

    }

    public static void main(String args[]) {
        DFS_4 tree = new DFS_4();
        tree.root = new Node_3(1);
        tree.root.lt = new Node_3(2);
        tree.root.rt = new Node_3(3);
        tree.root.lt.lt = new Node_3(4);
        tree.root.lt.rt = new Node_3(5);
        tree.root.rt.lt = new Node_3(6);
        tree.root.rt.rt = new Node_3(7);
        tree.BFS(tree.root);
    }
}
