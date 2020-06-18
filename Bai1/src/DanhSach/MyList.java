package DanhSach;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
        return true;
    }
    public void add(int index,E e){
        if (size == elements.length) {
            ensureCapa();
        }
        if(elements[index]==null){
            elements[index]=e;
            size++;
        }else{
            for(int i=size+1;i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=e;
            size++;
        }
    }
    public boolean contains(E e){
        int count=0;
        for(int i=0;i<elements.length;i++){
            if(elements[i]==e){
                count++;
            }
        }
        if(count>0){
            return true;
        }
        else {
            return false;
        }


    }
    public int size(){
        return this.size;
    }
    public void clear(){
    size=0;
    for(int i=0;i<elements.length;i++){
        elements[i]=null;
    }
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public int indexOf(E e){
        int index=-1;
        for(int i=0;i<size;i++){
            if(this.elements[i]==e){
                return i;
            }
        }
        return index;
    }
    public MyList<E> clone(){
        MyList<E> v=new MyList<E>();
        v.elements=Arrays.copyOf(this.elements,this.size);
        v.size=this.size;
        return v;
    }
    public E remove(int index){
        if(index<0||index>elements.length){
            throw new IllegalArgumentException("Error index"+index);
        }
        E element=(E) elements[index];
        for(int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }
}