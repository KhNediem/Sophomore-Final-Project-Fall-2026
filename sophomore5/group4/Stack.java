// STAND-IN for the Lab 6/7 Stack (String-based, linked). Replace with the real lab class if the method names differ.
public class Stack {
    private Node top;
    private int n;
    public void push(String x) { Node nd = new Node(x); nd.next = top; top = nd; n++; }
    public String pop() {
        if (top == null) throw new RuntimeException("Stack is empty");
        String r = top.data; top = top.next; n--; return r;
    }
    public String peek() {
        if (top == null) throw new RuntimeException("Stack is empty");
        return top.data;
    }
    public boolean isEmpty() { return n == 0; }
    public int size() { return n; }
}
