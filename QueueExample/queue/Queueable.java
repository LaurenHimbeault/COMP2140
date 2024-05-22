package queue;
public interface Queueable {
    void enqueue(Integer data);
    Integer dequeue();
    Integer peek(); // front();
    boolean isEmpty();
    // assume it can never be full
}
