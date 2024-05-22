package main;
import queue.Queue;


public class Main {
    public static void main(String[] args) {
        // with ArrayList cannot see the inner array        
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("print whole list");
        System.out.println(q);
        System.out.println("look at front element");
        System.out.println(q.peek());
        System.out.println("remove front element");
        System.out.println(q.dequeue());
        System.out.println("print whole list");
        System.out.println(q);
    }
}
