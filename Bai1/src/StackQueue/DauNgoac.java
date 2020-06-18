package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoac {
    public static void main(String[] args) {
        Stack<Character> list = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bieu thuc");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('||str.charAt(i) == ')') {
                list.push(str.charAt(i));
            }
        }
        int count=0;
        char a;
        while(!list.isEmpty()){
            a=list.pop();
            if(a=='('){
                count++;
            }else if(a==')'){
                count--;
            }

        }
        if(count%2==0){
            System.out.println("Bieu thuc nay hop le");
        }else {
            System.out.println("Bieu thuc nay khong hop le");
        }
        System.out.println("List" + list);

    }
}