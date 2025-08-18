package Tree;

import java.util.LinkedList;
import java.util.Queue;

//traverse eaach node level by level before backtracking
//it is also called as level order traversal
//it is implemented using queues
public class BFS {
    Node root;
    static void levelorder(Node node){
        if(node == null) return;
        Queue<Node>q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data+ " ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("level order traversal is: ");
        levelorder(tree.root);

    }
}
