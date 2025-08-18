package Tree;
//there are two types of traversals dfs and bfs 
// dfs can be implemented by using stack and recursion
// it go as long as possible along one branch before backtracking
class Node{
    int data;
    Node left,right;
    Node(int data1){
        this.data = data1;
        left = right = null;
    }
}
public class DFSusingRecursion {
    Node root;
    static void preorder(Node node){
        if(node == null) return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    static void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    static void postorder(Node node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String[] args) {
        DFSusingRecursion tree = new DFSusingRecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("preorder traversal is: ");
        preorder(tree.root);
        System.out.println("\ninorder traversal is: ");
        inorder(tree.root);
        System.out.println("\npostorder traversal is: ");
        postorder(tree.root);
    }
}
