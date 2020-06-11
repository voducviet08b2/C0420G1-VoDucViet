package MangVaPhuongThuc;

import java.util.Scanner;
import java.lang.String;
public class countCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap mot chuoi: ");
        String str=scanner.nextLine();
        System.out.println("Nhap mot ky tu: ");
        Character char1=scanner.nextLine().charAt(0);

        int count=0;

        for(int i=0;i<str.length();i++){
            if(Character.toString(str.charAt(i)).equals(Character.toString(char1))){
                count++;
            }
        }
        System.out.println("So lan xuat hien trong chuoi: "+count);
    }
}
