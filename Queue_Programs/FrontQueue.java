// Implement Queue using ArrayList, insert at front and delete from rear
// enQueue() deQueue() displayQueue()
package Queue_Programs;
import java.util.ArrayList;

public class FrontQueue {
    private ArrayList<Integer> queue;
    
    public FrontQueue() {
        queue = new ArrayList<>();
    }
    public void enQueue(int value) {
        queue.add(0, value); 
        System.out.println("Enqueued " + value + " to the queue");
    }
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; 
        }
        int value = queue.remove(queue.size() - 1);
        System.out.println("Dequeued " + value + " from the queue");
        return value;
    }
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue : ");
        for (int value : queue) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public static void main(String[] args) {
        FrontQueue q = new FrontQueue();
        
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.displayQueue(); 
        
        q.deQueue();
        q.displayQueue(); 
        
        q.enQueue(40);
        q.displayQueue(); 
        
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue(); 
        q.displayQueue(); 
    }
}