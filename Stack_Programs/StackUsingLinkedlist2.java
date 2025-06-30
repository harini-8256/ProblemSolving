package Stack_Programs;
public class StackUsingLinkedlist2 {
    private Node head;  
    private int size;

    public StackUsingLinkedlist2() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;     
        size++;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        int poppedValue = head.data;
        head = head.next;  
        size--;
        return poppedValue;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
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
