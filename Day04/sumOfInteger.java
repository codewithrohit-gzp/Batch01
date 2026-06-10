import java.util.*;

public class sumOfInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the Number.!");

            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;

            } else {
                oddSum += number;
            }
            System.out.println("Do you want to continue .? Press 1 for yes otherwise 0 if No");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of Even num :" + evenSum);
        System.out.println("Sum of Odd num :" + oddSum);

    }
}