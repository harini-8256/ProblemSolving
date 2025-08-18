package Tree;

import java.util.Stack;

// ZigZag Traversal is also called as spiral traversal it is the special form of level order traversal of binary tree
//where the direction alternates at each level
class Node{
    int data;
    Node left,right;
    Node(int data1){
        this.data = data1;
        left = right = null;
    }
}
public class ZigZagTraversal {
    Node root;
    static void zigzagtraversal(Node node){
        if(node == null) return;
        Stack<Node>curr = new Stack<>();
        Stack<Node>next = new Stack<>();
        curr.push(node);
        boolean lefttoright = true;
        while(!curr.isEmpty()){
            Node temp = curr.pop();
            System.out.print(temp.data+" ");
            if(lefttoright){
                if(temp.left != null){
                    next.add(temp.left);
                }
                if(temp.right != null){
                    next.add(temp.right);
                }
            }
            else{
                if(temp.right != null){
                    next.add(temp.right);
                }
                if(temp.left != null){
                    next.add(temp.left);
                }
            }
            while(curr.isEmpty()){
                lefttoright = !lefttoright;
                Stack<Node> tem = curr;
                curr = next;
                next = tem;

            }
        }

    }
    public static void main(String[] args) {
        ZigZagTraversal tree = new ZigZagTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.right = new Node(7);
        System.out.println("zigzag order traversal is: ");
        zigzagtraversal(tree.root);
    }
}
