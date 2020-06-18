package StackQueue;

import java.util.Scanner;

import java.util.Scanner;
import java.util.Stack;
public class DecimalToBinary {
    public void convertBinary(int num){
        Stack<Integer> stack = new Stack<Integer>();
        while(num != 0){
            int d = num%2;
            stack.push(d);
            num/=2;
        }
        while(!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }
    public static void main(String[]args){
        DecimalToBinary decimalToBinary=new DecimalToBinary();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int decimalNumber = scanner.nextInt();
        System.out.print("Hệ nhị phân của " + decimalNumber +" là :");
        decimalToBinary.convertBinary(decimalNumber);
    }
}