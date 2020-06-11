package IntroductionToJava;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your name:");
        String str=scanner.nextLine();
        System.out.println("IntroductionToJava.Hello "+str);

    }
}
