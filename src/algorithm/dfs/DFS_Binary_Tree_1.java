package algorithm.dfs;

class Node {
    int data;
    Node_3 lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DFS_Binary_Tree_1 {
    Node_3 root;

    public void DFS(Node_3 root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data+" ");
            DFS(root.lt);
//            System.out.print(root.data+" ");
            DFS(root.rt);
//            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        DFS_Binary_Tree_1 tree = new DFS_Binary_Tree_1();
        tree.root = new Node_3(1);
        tree.root.lt = new Node_3(2);
        tree.root.rt = new Node_3(3);
        tree.root.lt.lt = new Node_3(4);
        tree.root.lt.rt = new Node_3(5);
        tree.root.rt.lt = new Node_3(6);
        tree.root.rt.rt = new Node_3(7);
        tree.DFS(tree.root);

    }
}


