package DoublyLinkedList.conversion;
class Node{
     int data;
     Node next;
     Node prev;
    Node(int data1,Node next1,Node prev1){
        this.data = data1;
        this.next = null;
        this.prev = prev1;
    }
     Node(int data1){
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}
public class ConvertArrToDLL {
    private static Node convertArrToDLL(int arr[]){
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i = 1;i < arr.length;i++){
            Node temp = new Node(arr[i],null,move);
            move.next = temp;
            move = temp;
        }
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
        int arr[] = {1,2,3,4,5};
        Node head = convertArrToDLL(arr);
        System.out.println(head.data);
        printList(head);

    }
}
