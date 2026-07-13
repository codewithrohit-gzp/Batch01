package Day13;

import java.util.*;

public class missingValue {

    public static void main(String[] args) {

        // int nums[] = { 1, 0, 2, 5, 4, 6, 7 };

        int nums[] = { 1, 0, 2, 3, 5, 4, 6, 7, 9, 10, 12 };
        // sort the array
        Arrays.sort(nums);

        // find the missing value
        for (int i = 0; i < nums.length; i++) {
            // check
            if (i != nums[i]) {
                System.out.println("Missing value :" + i);
                break;
            }
        }

    }

}
