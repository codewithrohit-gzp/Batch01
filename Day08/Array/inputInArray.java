package Array;

import java.util.*;

public class inputInArray {

    public static void main(String[] args) {

        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks of the Given subject :phy, math and english !");

        // int phy = sc.nextInt();
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // Access the Array of subject mmarks

        System.out.println("phy marks :" + marks[0]);
        System.out.println("math marks :" + marks[1]);
        System.out.println("eng  marks:" + marks[2]);

        int avg = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("avg of the Student :" + avg);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3 * 100;
        // System.out.println(percentage + "%");

    }

}
