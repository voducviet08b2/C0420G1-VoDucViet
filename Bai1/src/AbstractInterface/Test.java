package AbstractInterface;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=5;
        a[1]=5;
        a[2]=5;
        a[3]=5;
        a[4]=5;
        a= Arrays.copyOf(a,10);
        a[5]=8;
        a[6]=10;
        System.out.println(Arrays.toString(a));
        Animal chicken=new Chicken();
        chicken.makeSound();
       Editble cook=(Chicken) chicken;
        cook.howToEat();
    }
}
