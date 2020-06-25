package Seach;
import java.util.Scanner;


    public class BinaryTreeSearch {
        int binarySearch(int arr[],int low,int high,int value){
            if (high>=low){
                int mid =(low+high)/2;
                if (arr[mid]==value){
                    return mid;
                }else if (arr[mid]>value){
                    return binarySearch(arr,low,mid-1,value);
                }else
                    return binarySearch(arr,mid+1,high,value);
            }
            return -1;
        }
        public static void main(String[] args) {
            BinaryTreeSearch binaryTreeSearch=new BinaryTreeSearch();
            int arrTree[]={45,55,57,59,60,67,100,101,107};
            Scanner scanner=new Scanner(System.in);
            System.out.println("Nhập số cần tìm vị trí: ");
            int num=scanner.nextInt();
            int low=0;
            int high=arrTree.length-1;
            System.out.println("Vị trí số bạn cần tìm là: ");
            System.out.println(binaryTreeSearch.binarySearch(arrTree,low,high,num));
        }
    }
