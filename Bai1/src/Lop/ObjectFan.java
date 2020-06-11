package Lop;

public class ObjectFan {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        System.out.println(fan1.toString());
        Fan fan2=new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setColor("Red");
        fan2.setOn(true);
        System.out.println(fan2.toString());
        System.out.println(Fan.data);
    }
}
