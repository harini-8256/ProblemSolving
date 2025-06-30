package SinglyLinkedlist.Deletion;
import java.util.Scanner;
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
public class DeleteAtPosition {
    private static int k;
    private static Node deleteAtposition(Node head,int k){
        if(head == null){
            return null;
        }
        if( k == 1){
          //  Node temp = head;
            head = head.next;
            return head;
        }
        Node prev = null;
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            
        }
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
        Scanner sc = new Scanner(System.in);
        Node head = new Node(sc.nextInt());
        Node second = new Node(sc.nextInt());
        Node third = new Node(sc.nextInt());
        k = sc.nextInt();
        sc.close();
        head.next = second;
        second.next = third;
        System.out.println("original list");
        printList(head);
        System.out.println("after deleting at tail");
        head = deleteAtposition(head,k);
        printList(head);

    }
}
