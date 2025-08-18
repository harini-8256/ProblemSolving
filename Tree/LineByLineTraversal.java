package Tree;
// linebyline traversal is a variant of level order traversal
// it is used to print the nodes level by level
//it is a special form of level order traversal of binary tree

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node right,left;
    Node(int data1){
        this.data = data1;
        right = left = null;
    }
}
public class LineByLineTraversal{
    Node root;
    static void linebyline(Node node){
        if(node == null) return;
        Queue<Node>q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int count = q.size();
            while(count>0){
                Node temp = q.poll();
                System.out.print(temp.data+" ");
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                count--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LineByLineTraversal tree = new LineByLineTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("line by line traversal is: ");
        linebyline(tree.root);
    }
}