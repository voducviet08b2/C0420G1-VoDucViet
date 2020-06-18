package DanhSach;

public class MyLinkedList<E> {
     class Node {
        private Node next;
        private Object data;

        public Node() {

        }

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E element) {
        Node temp = head;
        for(int i=0;i<size()-1;i++){
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNodes++;
    }

    public void add(int index,E element) {
        Node temp = head;
        Node holder;
        for(int i=0;i<index-1&&temp.next!=null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(element);
        temp.next.next=holder;
        numNodes++;
    }

    public int size() {
        return this.numNodes;
    }

    public E remove(int index){
        Object data=null;
        Node temp=head;
        if(index==0){
            data=temp.data;
            head=head.next;
            numNodes--;
        }else {
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            data=temp.next.data;
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element){
       Node temp=head;
       for(int i=0;i<size()-1;i++){
           temp=temp.next;
            if(temp.next.data.equals(element)){
                temp.next=temp.next.next;
                numNodes--;
                return true;
            }
       }
       return true;
    }
    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodes ;i ++){
            if(temp.getData().equals(element)){
                return i;
            }
        }
        return -1;
    }

    public boolean constains(E element){
        Node temp = head;
        for(int i = 0 ; i < numNodes&&temp.next != null; i++ ){
            if(temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public MyLinkedList<E> clone(MyLinkedList<E> list){
        MyLinkedList<E> returnLinked=new MyLinkedList<>();
        returnLinked.addFirst((E) list.get(0));
        for(int i=1;i<size();i++){
            returnLinked.addLast((E) list.get(i));
        }
        return returnLinked;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public Object getFirst() {
       return head.data;
    }
    public Object getLast() {
        Node temp=head;
        for(int i=0;i<size()-1;i++){
            temp=temp.next;
        }
        return temp.data;
    }

}