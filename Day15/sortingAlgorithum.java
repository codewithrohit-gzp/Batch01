package Day15;

public class sortingAlgorithum {

    public static void main(String[] args) {

        int weights[] = { 6, 4, 1, 3, 8, 2, 7 };
        int n = weights.length;
        int temp;

        for (int turn = 0; turn < n; turn++) {

            for (int j = 0; j < n - 1 - turn; j++) { // 7-1-0=6 -->j=0
                // int j = turn; // 7-1-1=5 -->j=1
                // swaping // 7-1-2=4 -->j=2
                if (weights[j] > weights[j + 1]) {
                    // int temp;
                    temp = weights[j];
                    weights[j] = weights[j + 1];
                    weights[j + 1] = temp;
                }
            }
        }
        // For print
        for (int i = 0; i < n; i++) {
            System.out.print(weights[i] + " ");
        }
    }

}
