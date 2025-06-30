package DoublyLinkedList.Deletion;
import java.util.Scanner;
class Node{
     int data;
     Node next;
     Node prev;
    Node(int data1,Node next1,Node prev1){
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }
     Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}
public class DeleteAtTail {
    private static Node deleteAtTail(Node head){
        if(head == null ){
            return null;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        Node back = temp.prev;
        back.next = null;
        temp.prev = null;
        return head;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
            System.out.print("<->");
        }
        }
            System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(sc.nextInt());
        Node second = new Node(sc.nextInt());
        Node third = new Node(sc.nextInt());
        sc.close();
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        System.err.println("original list");
        printList(head);
        head = deleteAtTail(head);
        System.out.println("after deleting the tail element");
        printList(head);
    }
}
