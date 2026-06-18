package Day11;

public class pairsOfArray {
    public static void main(String[] args) {

        int nums[] = { 2, 5, 6, 3, 8, 4, 5, 5, 6, 45, 1, 4, 6 };
        int l = nums.length;
        int NumsOfPairs = 0;

        // Outer Loop
        for (int i = 0; i < l; i++) {
            // current Value
            int curr = nums[i];
            // Innner Loop <-- to the print the Pairs of array
            for (int j = i + 1; j < l; j++) {
                NumsOfPairs++;
                System.out.print("(" + curr + "," + nums[j] + ")");
            }
            System.out.println();

        }

        System.out.println("Total Pairs : " + NumsOfPairs);

    }

}
