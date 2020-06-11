package MangVaPhuongThuc;

import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] matrix={
                {1,2,3},
                {12,74,12},
                {67,28,45},
        };
        int max=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("So lon nhat: "+max);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println("Nhap gia tri dong "+i+" cot "+j);
               matrix[i][j]=scanner.nextInt();
            }
        }

        for(int i=0;i<matrix.length;i++){
            System.out.println("");
            for(int j=0;j<matrix[i].length;j++){
                System.out.printf(" %d ",matrix[i][j]);
            }
        }
    }
}
