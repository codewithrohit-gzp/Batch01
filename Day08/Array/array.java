package Array;

public class array {

    public static void main(String[] args) {

        // Declared Array
        // syntax
        // int marks[] = new int[50];

        int scored[] = { 50, 75, 80, 65, 85, 25, 42, 75 };

        // String name[] = { "ram", "peeter", "herry" };

        // How to access the data
        System.out.println(scored[2]);
        // System.out.println("your scored is :" + scored[2]);
        // System.out.println(scored[3]);
        // System.out.println("your scored is :" + scored[4]);
        // System.out.println(scored[5]);

        // how to find the length of the array
        // .length
        System.out.println("Length of the Array :" + scored.length);

        // How to Update the Array
        // scored[2] = 95;

        // System.out.println("Updated Score :" + scored[2]);

        // how to iterate (looping) on the Array

        // for (int i = 0; i < scored.length; i++) {
        // System.out.println("matched scored : " + scored[i]);
        // }

        // int n=5;
        int l = scored.length; // n-1
        for (int i = 0; i < l; i++) {
            System.out.println(scored[i]);

        }
    }

}
