package Stack_Programs;
import java.util.*;
class Stack{
   int st[] = new int[10];
   int top =-1;
   void push(int x){
     if (top >= 10){
        System.out.println("cant push the elements");
     }
     top = top +1;
     st[top] = x;
   }
   void top(){
    if(top == -1){
        System.out.println("there is no element");
    }
    System.out.println("the top element is "+st[top]);
   }
   void pop(){
    if(top==-1){
        System.out.println("there is no elements to remove");
    }
    top = top-1;
   }
   void size(){
    System.out.println("size is"+" "+(top+1));
   }
}

public class StackUsingArray {
    public static void main(String[] args) {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.pop();
    s.top();
    s.push(22);
    s.size();
    }
    

}
