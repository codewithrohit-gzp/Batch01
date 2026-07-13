package Oops;

class Student {
    String name;
    int rollNo;

    void sleep() {
        System.out.println("I am sleeping..");
    }

    // self creation
    Student() { // Non- parameterized -->this is define the constructor
        System.out.println("i am call constructor..");
    }

    Student(String name) { // Permeterized
        this.name = name;
    }

    Student(int rollNo) { // Permeterized
        this.rollNo = rollNo;
    }
}

public class Constructor {

    public static void main(String[] args) {

        Student s1 = new Student("Petter");
        Student s2 = new Student(21);

        // s1.name = "riya";
        System.out.println("hy," + s1.name);

        // s1.sleep();

    }

}
