package StackQueue;

public class TrienKhaiQueueLinkedList {
    class Node {
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;

    public TrienKhaiQueueLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
    public static void main(String[] args) {
        TrienKhaiQueueLinkedList queue = new TrienKhaiQueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
