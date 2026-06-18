package Day10;

public class reverseOfArray {

    public static void main(String[] args) {
        int nums[] = { 5, 6, 8, 9, 4, 3, 2 };
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            // incc and dec
            first++;
            last--;
        }

        // Print the Array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
