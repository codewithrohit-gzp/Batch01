package Day10;

public class arrayMax {

    public static void main(String[] args) {

        // find the maximum number
        int arr[] = { 8, 6, 7, 200, 3 };

        int largest = Integer.MIN_VALUE; // for the largest number
        int smallest = Integer.MAX_VALUE;

        int n = arr.length; // 5
        // System.out.println(largest);

        for (int i = 0; i < n; i++) {
            // check
            if (largest < arr[i]) {
                largest = arr[i];
            }

        }

        // For the smallest Number of the given array
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];

            }

        }

        System.out.println("Largest Of the Number :" + largest);
        System.out.println("Smallest Of the Number :" + smallest);

    }

}
