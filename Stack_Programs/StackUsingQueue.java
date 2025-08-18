package Stack_Programs;

import java.util.LinkedList;
import java.util.Queue;

class MyStack{
    private Queue<Integer>q= new LinkedList<>();
    void push(int x){
        q.add(x);
        int size = q.size();
        for(int i=0;i<size-1;i++){
            q.add(q.remove());
        }
    }
    void pop(){
        q.remove();
    }
    int top(){
        return q.peek();
    }
    boolean empty(){
        return q.isEmpty();
    }
    int size(){
        return q.size();
    }

}
public class StackUsingQueue{
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("top element is "+s.top());
        System.out.println("size is "+s.size());
        s.pop();
        s.pop();
        System.out.println("top element is "+s.top());
    }
}

