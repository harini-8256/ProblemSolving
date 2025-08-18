package Queue_Programs;
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
class MyQueue{
    Node start;
    Node end;
    int size=0;
    void push(int x){
    Node temp = new Node(x);
    if(start == null && end == null){
        start = end = temp;
    }
    else{
        end.next=temp;
        end=temp;
    }
    size = size+1;
} 
void pop(){
    if(start == null){
        System.out.println("there is no elements");
        return;
    }
    Node temp = start;
    start= start.next;
    size = size-1;
}
int top(){
    if(start == null){
        System.out.println("there is no elements");
        return -1;
    }
    return start.data;
}
int size(){
    return size;
}

}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        MyQueue q1 = new MyQueue();
        q1.push(10);
        q1.push(20);
        q1.push(30);
        System.out.println("the top element is "+q1.top());
        q1.push(40);
        System.out.println("size is "+q1.size());
    }
}
