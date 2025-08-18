package Tree;
import java.util.*;
public class DFSusingStack {
    Node root;
    //preorder
    static void preorder(Node node){
        if(node == null) return;
        Stack<Node>st = new Stack<>();
        st.add(node);
        while(!st.isEmpty()){
            Node temp = st.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null){
                st.add(temp.right);
            }
            if(temp.left != null){
                st.add(temp.left);
            }
        }
    }
    //inorder
    static void inorder(Node node){
        if(node == null) return;
        Stack<Node>st = new Stack<>();
        Node curr = node;
        while(curr != null || !st.isEmpty()){
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;
        }
    }
    //postorder
    static void postorder(Node node){
        if(node == null) return;
        Stack<Node>s1 = new Stack<>();
        Stack<Node>s2 = new Stack<>();
        s1.push(node);
        while(!s1.isEmpty()){
            Node temp = s1.pop();
            s2.push(temp);
            if(temp.left != null){
                s1.push(temp.left);
            }
            if(temp.right != null){
                s1.push(temp.right);
            }
        }
        while(!s2.isEmpty()){
            System.out.print(s2.pop().data+" ");
        }
    }
    public static void main(String[] args) {
        DFSusingStack tree = new DFSusingStack();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("preorder traversal using stack: ");
        preorder(tree.root);
        System.out.println("\ninorder traversal is: ");
        inorder(tree.root);
        System.out.println("\npostorder traversal is: ");
        postorder(tree.root);
    }
}
