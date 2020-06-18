package DanhSach;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(45);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5,453534);
        System.out.println("element 5: "+listInteger.get(5));

        System.out.println(listInteger.indexOf(2));


    }
}