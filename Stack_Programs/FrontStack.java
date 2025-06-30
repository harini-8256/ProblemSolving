// Implement Stack using ArrayList perform both operations at front
// push() pop() displatStack()
package Stack_Programs;

import java.util.ArrayList;
public class FrontStack {
    private ArrayList<Integer> stack;
    
    public FrontStack() {
        stack = new ArrayList<>();
    }
    public void push(int value) {
        stack.add(0, value);
        System.out.println("Pushed " + value + " to the stack");
    }
    

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1; 
        }
        int value = stack.remove(0);
        System.out.println("Popped " + value + " from the stack");
        return value;
    }
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack:");
        for (int value : stack) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        FrontStack stack = new FrontStack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack(); 
        
        stack.pop();
        stack.displayStack(); 
        
        stack.push(40);
        stack.displayStack(); 
        
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); 
        stack.displayStack();
    }
}