package Stack_Programs;

import java.util.LinkedList;
import java.util.Queue;

class Stack{
    private Queue<Integer>queue = new LinkedList<>();
    void push(int x){
        queue.add(x);
        int size = queue.size();
        for(int i=0;i<size-1;i++){
            queue.add(queue.remove());
        }
    }
    int top(){
        return queue.peek();
    }
    void pop(){
        if(queue.isEmpty()){
            System.out.println("Stack is empty");
        }
        queue.remove();
    }
    boolean empty(){
        return queue.isEmpty();
    }
}
public class StackUsingOneQueue {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.pop();
        s.pop();

        s.push(10);
        System.out.println("top element is"+s.top());
    }
}
