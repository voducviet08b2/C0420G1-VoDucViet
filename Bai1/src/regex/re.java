package regex;

import java.util.regex.Pattern;

public class re {
    public static void main(String[] args) {

                boolean b=Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)","dsfds@fdgd.com");
        System.out.println(b);
    }
}
