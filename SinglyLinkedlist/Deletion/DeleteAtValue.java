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
public class DeleteAtValue {
    private static int element;
    private static Node deleteAtValue(Node head,int element){
        if(head == null){
            return null;
        }
        if( head.data == element){
          //  Node temp = head;
            head = head.next;
            return head;
        }
        Node temp= head;
        Node prev = null;
        while(temp!=null){
            if(temp.data == element){
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
        Node fourth = new Node(sc.nextInt());
        element = sc.nextInt();
        sc.close();
        head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println("original list");
        printList(head);
        System.out.println("after deleting the element");
        head = deleteAtValue(head,element);
        printList(head);

    }
}
