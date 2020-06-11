package MangVaPhuongThuc;

import java.util.Scanner;

public class maxColumn {
    public static void main(String[] args) {
        int[][] matrix={
                {6,7,9},
                {6,7,9},
                {6,7,9}
        };
        Scanner scanner=new Scanner(System.in);
        int tong=0;
        System.out.println("Nhap so cot muon tinh tong");
        int col=scanner.nextInt();
        for(int i=0;i<matrix.length;i++){
            tong+=matrix[i][col];
        }
        System.out.println("Tong cot "+col+" la: "+tong);

    }
}
