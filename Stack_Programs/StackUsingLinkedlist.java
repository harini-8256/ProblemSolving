package Stack_Programs;

class Node {
    int data;
    Node next;
    Node(int data1,Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class StackUsingLinkedlist {
    private Node head;  
    private Node tail;  
    private int size;

    public StackUsingLinkedlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        int poppedValue = tail.data;
        if (head == tail) { 
            head = null;
            tail = null;
        } 
        else 
        {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
        size--;
        return poppedValue;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return tail.data;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        StackUsingLinkedlist stack = new StackUsingLinkedlist();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  
        System.out.println("Popped: " + stack.pop());  
        stack.display();  
        System.out.println("Top element: " + stack.peek());  
    }
}