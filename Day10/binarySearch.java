package Day10;

public class binarySearch {

    public static void main(String[] args) {
        // float a = 10.5f;
        // System.out.println(Math.floor(a));
        // Binary Search Algorithum

        int nums[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        int s = 0;
        int e = nums.length - 1;
        int key = 10;

        while (s <= e) {
            int m = (s + e) / 2;

            // check
            if (nums[m] == key) { // found
                System.out.println("Element found at index :" + m);
                break;
            } else if (key < nums[m]) {
                // go to left
                e = m - 1;

            } else {
                // go to right
                s = m + 1;
            }
        }

    }

}
