package StackQueue;

public class LinkedListQueue {
    class Node{
        private int data;
        private Node link;

        public Node(int data){
            this.data=data;
        }
    }
    public Node front;
    public Node rear;
    public LinkedListQueue(){
        front=null;
        rear=null;
    }
    public void enqueue(int number){
        Node temp=new Node(number);
        if(this.rear==null){
            this.front=temp;
            this.rear=temp;
        }
        this.rear=temp;
    }

    public static void main(String[] args) {
        LinkedListQueue list=new LinkedListQueue();
        list.enqueue(5);
        list.enqueue(6);
        list.enqueue(7);
        System.out.println(list.front.data);
        System.out.println(list.rear.data);

    }

}
