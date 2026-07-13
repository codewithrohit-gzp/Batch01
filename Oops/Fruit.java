package Oops;

class Fruits {
    String name;
    String color;
    String taste;

    void eat() {
        System.out.println("eat now .!" + name);
    }

    void setName(String fruitName) {
        name = fruitName;

    }

}

public class Fruit {

    public static void main(String[] args) {
        Fruits f1 = new Fruits();
        f1.setName("apple");
        f1.eat();
        System.out.println(f1.name);

    }

}
