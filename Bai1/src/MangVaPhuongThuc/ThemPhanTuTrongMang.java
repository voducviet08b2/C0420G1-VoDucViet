package MangVaPhuongThuc;
import java.util.Scanner;
public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        int[] array1 = new int[11];
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử can them:");
        int number = scanner.nextInt();
        System.out.println("Nhập vi tri can them:");
        int index = scanner.nextInt();
        array1[index] = number;
        for (int i = 0; i < index; i++) {
            if (i == index) {
                continue;
            }
            array1[i] = array[i];
        }
        for (int i = index; i < array1.length - 1; i++) {
            array1[i + 1] = array[i];
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
