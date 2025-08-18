package Stack_Programs;

import java.util.LinkedList;
import java.util.Queue;

class StackMy{
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
     void pop(){
        q1.remove();
     }
     int top(){
        return q1.peek();
     }
     boolean empty(){
        return q1.isEmpty();
     }
     int size(){
        return q1.size();
     }
}
public class StackUsingTwoQueues {
    public static void main(String[] args) {
        StackMy q = new StackMy();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        System.out.println("top element is "+q.top());
        System.out.println("size is "+q.size());
        q.pop();
        q.pop();
        System.out.println("top element is "+q.top());
    }
}
