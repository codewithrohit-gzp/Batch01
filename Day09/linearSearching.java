package Day09;

import java.util.*;

public class linearSearching {

    public static void main(String[] args) {

        int arr[] = { 10, 12, 13, 45, 5, 8, 2, 14 };
        int key = 50;

        boolean check = false;

        // int minValue = Integer.MAX_VALUE; //+infinity
        // int maxValue = Integer.MIN_VALUE; //-infinity

        int l = arr.length; // length of array
        for (int i = 0; i < l; i++) {
            if (arr[i] == key) {
                check = true;
                // System.out.println("Number Found! at index:" + i);
            }
        }
        if (check == false) {
            System.out.println("NOt Found !");
        } else {
            System.out.println("Found !");

        }

    }

}
