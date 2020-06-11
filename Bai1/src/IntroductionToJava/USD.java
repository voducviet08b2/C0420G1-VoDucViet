package IntroductionToJava;

import java.util.Scanner;

public class USD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input money");
        float usd=scanner.nextFloat();
        float vnd=usd*23000;
        System.out.println("Tien Viet Nam la "+vnd);
    }
}
