package AbstractInterface;

public class Chicken extends Animal implements Editble {
    @Override
    public void makeSound(){
        System.out.println("Quac Quac");
    }

    @Override
    public void howToEat() {
        System.out.println("Chien roi an");
    }
}
