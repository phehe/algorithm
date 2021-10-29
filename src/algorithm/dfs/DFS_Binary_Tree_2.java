package algorithm.dfs;


 class Node_2 {
    int data;
    Node_2 left;
    Node_2 right;
}

 class Tree {
    Node_2 root;

    public Node_2 getRoot() {
        return root;
    }

    public void setRoot(Node_2 root) {
        this.root = root;
    }

     Node_2 makeNode(Node_2 left, int data, Node_2 right) {
         Node_2 nd = new Node_2();
         nd.data = data;
         nd.left = left;
         nd.right = right;

         return nd;
     }

     void inorder(Node_2 node_2) {
         if (node_2 != null) {
             inorder(node_2.left);
             System.out.print(node_2.data+" ");
             inorder(node_2.right);
         }
     }

     void preorder(Node_2 node_2) {
         if (node_2 != null) {
             System.out.print(node_2.data + " ");
             preorder(node_2.left);
             preorder(node_2.right);
         }
     }

     void postorder(Node_2 node_2) {
         if (node_2 != null) {
             postorder(node_2.left);
             postorder(node_2.right);
             System.out.print(node_2.data+" ");
         }
     }
}
public class DFS_Binary_Tree_2 {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node_2 n4 = t.makeNode(null, 4, null);
        Node_2 n5 = t.makeNode(null, 5, null);
        Node_2 n2 = t.makeNode(n4, 2, n5);
        Node_2 n3 = t.makeNode(null, 3, null);
        Node_2 n1 = t.makeNode(n2, 1, n3);
        t.setRoot(n1);
        t.inorder(t.getRoot());
        t.preorder(t.getRoot());
        t.postorder(t.getRoot());
    }

}
