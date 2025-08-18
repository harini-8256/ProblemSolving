package Stack_Programs;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
    }
}
class StackWithLinkedlist{
     Node top ;
     int size=0;
     void push(int x){
        Node temp = new Node(x);
        temp.next=top;
        top = temp;
        size = size+1;
     }
     void pop(){
        if(top == null){
            System.out.println("there are no elements to remove");
            return;
        }
        Node temp = top;
        top = top.next;
        size = size-1;
        System.out.println("removed element"+" "+ temp.data);

     }
     int peek(){
        if(top== null){
            System.out.println("there are no elements");
            return -1;
        }
        return top.data;
     }
    int size(){
        return size;
    }
}
public class StackUsingLinkedlist {
    public static void main(String[] args) {
        StackWithLinkedlist s = new StackWithLinkedlist();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        System.out.println("top element "+s.peek());
        s.push(49);
       System.out.println("size is "+s.size());
    }
}
