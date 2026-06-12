package Day06;

import java.util.*;

public class sumOfEvenorOddNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // for take the value form the user

        int evenNum = 0;
        int oddNum = 0;
        int choice;

        do {

            System.out.println("Enter you number :");

            int n = sc.nextInt();

            if (n % 2 == 0) {
                evenNum += n; // evenNum = evenNum +n
            } else {
                oddNum += n;
            }

            System.out.println("Do you want to continue :1 ,other wise 0");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of Even Number :" + evenNum);
        System.out.println("Sum of Odd Number :" + oddNum);

        System.out.println("Sum of All Number :" + (evenNum + oddNum));

    }

}
