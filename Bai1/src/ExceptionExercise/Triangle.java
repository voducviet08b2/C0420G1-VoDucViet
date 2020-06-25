package ExceptionExercise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bool=true;

        while(bool){
            System.out.println("Nhap canh thu nhat: ");
            int a=scanner.nextInt();
            System.out.println("Nhap canh thu hai: ");
            int b=scanner.nextInt();
            System.out.println("Nhap canh thu ba: ");
            int c=scanner.nextInt();
            try {
                nhap(a,b,c);
                bool=false;
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }

    }
    public static void nhap(int a,int b,int c) throws ExceptionTriangle{
        if(a<0||b<0||c<0) {
            throw new ExceptionTriangle("Gia tri phai lon hon 0");
        }else if(a+b<c||a+c<b||b+c<a){
            throw new ExceptionTriangle("Tong 2 canh khong lon hon canh con lai");
        }else {
            System.out.println("Chu vi tam giac la: "+(a+b+c));
        }

        }
    }


