package Day07;

public class butterfly {

    // Function Print Butterfly

    public static void printButterfly(int n) {

        // For 1st Half
        // stars 1 to n
        for (int i = 1; i <= n; i++) { // outerloop

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("  *");
            }
            // spaces 2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("   ");
            }
            // stars 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print("  *");
            }
            System.out.println();

        }

        // for 2nd Half ----> n to 1
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("  *");
            }
            // spaces 2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("   ");
            }
            // stars 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print("  *");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        printButterfly(10);

    }

}
