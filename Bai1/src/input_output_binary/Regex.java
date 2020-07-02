package input_output_binary;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        boolean b= Pattern.matches("[-_a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)","ab@gmail");
        System.out.println(b);
    }
}
