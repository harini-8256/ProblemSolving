// Tree is a non linear data structure made up of nodes connected with edges
// It represents the data in heirarchical form
//it implements complex problems
//Binary tree is a tree that has atmost two children
package Tree;
class Node{
    Node left,right;
    int data;
    Node(int data1){
        this.data = data1;
        left=right=null;
    }
    public Node pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }
}
public class BinaryTreeImplementation {
    Node root;
    public static void main(String[] args) {
        BinaryTreeImplementation tree = new BinaryTreeImplementation();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    }
}
