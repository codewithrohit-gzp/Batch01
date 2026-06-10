package Day04;

import java.util.*;

public class checkPrimeNumber {

    public static void main(String[] args) {

        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number");

        int n = sc.nextInt();

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("Your Number is Prime !");
        } else {
            System.out.println("Your Number is Not Prime");
        }

    }

}
