package SinglyLinkedlist.Insertion;

import java.util.Scanner;

public class InsertAtTail {
    private static int element;
    private static Node insertAtTail(Node head,int element){
        if(head == null){
            return null;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(element);
        temp.next = newNode;
        return head;
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
        System.out.println("after inserting the element at tail");
        head = insertAtTail(head,element);
        printList(head);

    }
}
