package Day12;

public class printSubArray {

    public static void main(String[] args) {

        int nums[] = { 2, 5, 4, 8, 6, 3, 4 };
        int l = nums.length;

        // Outer Loop
        for (int i = 0; i < l; i++) {
            int start = i;
            // Inner loop
            for (int j = start; j < l; j++) {
                int end = j;

                // for print the Sub Array
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");

                }
                System.out.println();

            }
            System.out.println();
        }

    }

}
