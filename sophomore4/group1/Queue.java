// STAND-IN for the Lab 6/7 Queue (String-based, linked). Replace with the real lab class if the method names differ.
public class Queue {
    private Node head, tail;
    private int n;
    public void enqueue(String x) {
        Node nd = new Node(x);
        if (tail == null) head = tail = nd; else { tail.next = nd; tail = nd; }
        n++;
    }
    public String dequeue() {
        if (head == null) throw new RuntimeException("Queue is empty");
        String r = head.data; head = head.next; if (head == null) tail = null; n--; return r;
    }
    public String peek() {
        if (head == null) throw new RuntimeException("Queue is empty");
        return head.data;
    }
    public boolean isEmpty() { return n == 0; }
    public int size() { return n; }
}
