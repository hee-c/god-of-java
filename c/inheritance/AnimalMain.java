package c.inheritance;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eatFood();
        cat.eatFood();
        dog.move();
        cat.move();
    }
}
