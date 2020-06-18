package StackQueue;

public class MyStackLearn<E> {
    public int[] arr;
    public int size;
    public int index;
    public MyStackLearn(int size){
        arr=new int[size];
        this.index=0;
        this.size=size;
    }

    public void push(int number){
        arr[index]=number;
        index++;
    }

    public int pop(){
        int temp=arr[index-1];
        arr[index-1]=0;
        index--;
        return temp;
    }

    public int peek(){

        return arr[index-1];
    }

    public boolean isEmpty(){
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyStackLearn stack1=new MyStackLearn(10);
        MyStackLearn stack=new MyStackLearn(10);
        stack.push(6);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        for(int i=0;i<stack.size;i++){
            System.out.print(" "+ stack.arr[i]);
        }
        stack1.push(stack.pop());
        stack1.push(stack.pop());
        stack1.push(stack.pop());
        stack1.push(stack.pop());
        System.out.println();
        for(int i=0;i<stack1.size;i++){
            System.out.print(" "+ stack1.arr[i]);
        }
    }
}
