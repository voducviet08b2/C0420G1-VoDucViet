package MangVaPhuongThuc;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array={2,3,6,7,67,34,23};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa:");
        int number=scanner.nextInt();
        int index=indexNumber(array,number);
        for(int i=index;i<array.length-1;i++){
   //         System.out.println(array[i]);
//            if(i==array.length){break;}
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static int indexNumber(int[] array,int number){
        int a=0;
        for(int i=0;i<array.length;i++){
            if(number==array[i]){
                a=i;
            }
        }
        return a;
    }
}
