package Day04;

import java.util.Scanner;

public class printStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        // Outer loop
        // for (int outer = 1; outer <= n; outer++) {
        // // Inner Loop
        // for (int star = 1; star <= outer; star++) {
        // System.out.print("*");
        // }
        // System.out.println("");

        // }
        // *
        // **
        // ***
        // ****

        // Next Question
        // Inverted Stars

        // Outer loop
        for (int outer = 1; outer <= n; outer++) {
            // Inner Loop
            for (int star = 1; star <= n - outer + 1; star++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
