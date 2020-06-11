package MangVaPhuongThuc;

public class SumMatrixCross {
    public static void main(String[] args) {
        int[][] matrix={
                {6,7,9},
                {6,7,9},
                {6,7,9}
        };
        int tong=0;
        for(int i=0;i<matrix.length;i++){
            tong+=matrix[i][i];
        }
        System.out.println("Tong: "+tong);
    }
}
