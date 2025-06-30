package SinglyLinkedlist.Deletion;

class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }

}
public class DeleteAtHead {
    private static Node deleteAtHeadPosition(Node head){
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
        System.out.println("original list");
        printList(head);
        head = deleteAtHeadPosition(head);
        System.out.println("after deleting head");
        printList(head);

    }
}
