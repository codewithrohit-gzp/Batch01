package Oops;

class Student {
    // properties
    String name;
    int roll_no;
    int id_card;
    // ----------------------

    // method
    void sleep() {
        System.out.println("I am sleeping..");

    }

    void eat() {
        System.out.println("I am eating ...");

    }

    void walk() {
        System.out.println("I am not able to walk !" + name);

    }

}

public class day01 {
    public static void main(String[] args) {
        // how to create the object
        Student std1 = new Student();
        Student std2 = new Student();

        std1.name = "Alok";
        std2.name = "Amit";

        std1.sleep();

        std2.walk();
        System.out.println("std1 name :" + std1.name);

    }

}
