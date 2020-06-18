package StackQueue;

public class MyStackLearnString<E> {
    public char[] arr;
    public int size;
    public int index;
    public MyStackLearnString(int size){
        arr=new char[size];
        this.index=0;
        this.size=size;
    }

    public void push(char kytu){
        arr[index]=kytu;
        index++;
    }

    public char pop(){
        char temp=arr[index-1];
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
        String chuoi="viet nam";
        MyStackLearnString stack1=new MyStackLearnString(10);
        MyStackLearnString stack=new MyStackLearnString(10);
        for(int i=0;i<chuoi.length();i++){
            stack.push(chuoi.charAt(i));
        }

        String mWord="";
        for(int i=0;i<chuoi.length();i++){
            mWord+=stack.pop();
        }


        System.out.println(mWord);


    }
}
