package Queue_Programs;
import java.util.*;
//import java.util.LinkedList;
class QueueMy{
     private Stack<Integer>s1 = new Stack<>();
     private Stack<Integer>s2 = new Stack<>();
     void push(int x){
        while(!s1.isEmpty()){
            s2.add(s1.peek());
            s1.pop();
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.add(s2.peek());
            s2.pop();
        }
     }
     void pop(){
        s1.pop();
     }
     int top(){
        return s1.peek();
     }
     boolean empty(){
        return s1.isEmpty();
     }

}
public class QueueUsingStack {
    public static void main(String[] args) {
        QueueMy q2 = new QueueMy();
        q2.push(10);
        q2.push(30);
        q2.push(40);
        System.out.println("top element is "+q2.top());
        q2.pop();
        q2.push(50);
        System.out.println("top element is "+q2.top());

    }

}
