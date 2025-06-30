package SinglyLinkedlist.conversion;

import java.util.*;

//import SinglyLinkedlist.Deletion.Node;

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
public class ConverArraytoLinkedlist {
    private static Node arrayToLinkedlist(int arr[]){
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i=1;i< arr.length;i++){
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
     Node head = arrayToLinkedlist(arr);
     System.out.println(head.data);
    }
}
