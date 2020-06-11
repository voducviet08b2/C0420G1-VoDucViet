package MangVaPhuongThuc;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1={34,23,545,764,45};
        int[] arr2={4,3,55,64,51,23};
        int[] arrTong=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arrTong[i]=arr1[i];
        }
        for(int i=arr1.length,j=0;i<arrTong.length;i++,j++){

            arrTong[i]=arr2[j];
        }
        for(int i=0;i<arrTong.length;i++){
            System.out.println(arrTong[i]);
        }
    }
}
