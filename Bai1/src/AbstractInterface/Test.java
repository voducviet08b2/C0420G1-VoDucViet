package AbstractInterface;

public class Test {
    public static void main(String[] args) {
        Animal chicken=new Chicken();
        chicken.makeSound();
       Editble cook=(Chicken) chicken;
        cook.howToEat();
    }
}
