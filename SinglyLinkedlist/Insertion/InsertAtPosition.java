package SinglyLinkedlist.Insertion;

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
public class InsertAtPosition {
    private static int position;
    private static int ele;
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
   private static Node insertAtPosition(Node head,int position,int ele){
       if(head == null){
        return new Node(ele);
       }
       if(position == 1){
        Node newNode = new Node(ele,head);
        return newNode;
       }
       Node temp = head;
       int count =1;
       Node newNode = new Node(ele);
       while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;

   }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Node head = new Node(sc.nextInt());
        Node second = new Node(sc.nextInt());
        Node third = new Node(sc.nextInt());
        head.next = second;
        second.next = third;
        position =sc.nextInt();
        ele = sc.nextInt();
        sc.close();
        System.out.println("original list");
        printList(head);
        System.out.println("after inserting the element at tail");
        head = insertAtPosition(head,position,ele);
        printList(head);
    }
}
