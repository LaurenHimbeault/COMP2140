package queue;

public class Queue implements Queueable {

    private CircularLinkedList cll;
    public Queue() {
        cll = new CircularLinkedList();
    }
    public void enqueue(Integer data) {
        cll.addToEnd(data);
    }

    public Integer dequeue() {
        return cll.removeFromFront();
    }

    public Integer peek() {
        return cll.lookAtFront();
    }

    public boolean isEmpty() {
        return cll.lookAtFront() == null;
    }

    public String toString() {
        return cll.toString();
    }
    
}
