package Day16;

import java.util.*;

public class palindrome {

    public static boolean isPalindrome(String word) {

        for (int i = 0; i < word.length() / 2; i++) {
            // check it is not
            int n = word.length();
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        String word = "racecar";
        System.out.println(isPalindrome(word));

    }

}
