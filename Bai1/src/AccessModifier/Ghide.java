package AccessModifier;

public class Ghide {
    public static void main(String[] args) {
        A a = new A();

        a.p(10.0);
        a.p(10);
    }
}
class A extends B {
    public void p(int number) {
        System.out.println(number);
    }
}

class B {
    public void p(double number) {
        System.out.println(number * 2);
    }
}