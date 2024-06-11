package c.inheritance;

public class Dog extends Animal {
    int weight;

    public void move() {
        System.out.println("개가 움직인다~");
    }

    public void makeSound() {
        System.out.println("왈왈");
    }
}
