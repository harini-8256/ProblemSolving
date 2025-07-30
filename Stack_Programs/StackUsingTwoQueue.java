package Stack_Programs;

import java.util.LinkedList;
import java.util.Queue;

class Stack{
    private Queue<Integer>q1 = new LinkedList<>();
     private Queue<Integer>q2 = new LinkedList<>();
    void push(int x){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    int top(){
        return q1.peek();
    }
    void pop(){
        q1.remove();
    }
    boolean empty(){
        return q1.isEmpty();
    }
}
public class StackUsingTwoQueue {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("top element"+s.top());
        s.pop();
        s.push(40);
        s.push(50);
        s.pop();
        System.out.println("top element"+s.top());
    }
}
