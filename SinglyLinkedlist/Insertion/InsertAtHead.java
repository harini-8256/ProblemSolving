package SinglyLinkedlist.Insertion;
import java.util.*;
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
public class InsertAtHead {
    private static int element;
    private static Node insertAtHead(Node head,int element){
        if (head == null){
            return new Node(element);
        } 
        Node newNode = new Node(element,head);
        return newNode;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(sc.nextInt());
        Node second = new Node(sc.nextInt());
        Node third = new Node(sc.nextInt());
        head.next = second;
        second.next = third;
        element =sc.nextInt();
        sc.close();
        System.out.println("original list");
        printList(head);
        System.out.println("after inserting the element");
        head = insertAtHead(head,element);
        printList(head);

    }
}
