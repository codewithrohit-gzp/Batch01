package Array;

import java.util.*;

public class evenAndOddCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array or Score ,which you have to pass .!");
        int n = sc.nextInt();
        int num = 1;
        int score[] = new int[n];
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter your " + num + " Score.!");
            num++;
            score[i] = sc.nextInt();

        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            // check if even or odd
            if (score[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count :" + evenCount);
        System.out.println("Odd Count :" + oddCount);

    }

}
