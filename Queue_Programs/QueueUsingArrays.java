package Queue_Programs;
class Queue{
    int size =10;
    int currentSize =0;
    int q[] = new int[size];
    int start = -1;
    int end = -1;
    void push(int x){
    if(currentSize == size){
        System.out.println("there is no space to push an element");
        return;
    }
    if(start == -1 && end == -1){
         start =0;
         end =0;
    }
    else{
        end = (end+1)%size;
        
    }
    q[end] = x;
    currentSize++;
}
void pop(){
    if(currentSize == 0){
        System.out.println("there are no elements to pop");
    }
    start = (start+1)%size;
    currentSize--;
    if(currentSize == 0){
        start = -1;
        end = -1;
    }
}
int top() {
    if(currentSize==0){
        System.out.println("there are no elements");
    }
    return q[start];
}
int size(){
    return currentSize;
}

}
public class QueueUsingArrays {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.push(10);
        q1.push(20);
        q1.push(30);
        q1.push(40);
        System.out.println("top element is "+q1.top());
        System.out.println("size is "+q1.size());
        q1.pop();
         q1.pop();
        System.out.println("top element is "+q1.top());

    }
}
