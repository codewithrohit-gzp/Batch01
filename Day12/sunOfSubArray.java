package Day12;

public class sunOfSubArray {

    public static void main(String[] args) {

        int nums[] = { 2, 5, 4, 8, 6, 3, 4 };
        // int nums[] = { -1, 2, -2, 3, 1 }; //you find the maximum value of the given
        // array

        int l = nums.length;

        // Outer Loop
        for (int i = 0; i < l; i++) {
            int start = i;
            // Inner loop
            for (int j = start; j < l; j++) {
                int end = j;
                int currSum = 0;

                // for print the Sub Array
                for (int k = start; k <= end; k++) {
                    // System.out.print(nums[k] + " ");

                    currSum = currSum + nums[k];

                }
                System.out.print(currSum);

                System.out.println();

            }
            System.out.println();
            // System.out.println(currSum);
        }

    }

}
