package Oops;

class College {
    // properties students
    public String name;
    protected int roll_name;
    public int id_card;
    private int password;

    // what is the means of this keyword
    // .this

    // methods
    // setter Method
    int setPassword(int password) { // params ---->newPassword
        return this.password = password;
    }

    // getter method
    int getPassword() {
        return this.password;
    }

    void printName() {
        System.out.println("my name is :" + name);
    }

    void study() {

        System.out.println("I am studing..");
    }

    void running() {
        System.out.println("I am running now ..");
    }

    void code() {
        System.out.println("I am doing coding now ....");
    }

    // void printPassword() {
    // System.out.println("my password is ," + password);
    // }

}

public class Student {

    public static void main(String[] args) {

        // obj
        College std1 = new College();
        College std2 = new College();
        std1.name = "Alok";
        std1.setPassword(123456);

        std1.code();
        std1.printName();
        System.out.println(std1.getPassword());

    }

}
