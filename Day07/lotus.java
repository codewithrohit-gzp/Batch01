public class lotus {

    public static void main(String[] args) {

        int n = 5; // Size of the lotus

        // ==========================
        // Upper Half of Lotus
        // ==========================
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Left Petal
            System.out.print(" *");

            // Space between petals
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // Middle Petal
            System.out.print(" *");

            // Space between middle and right petal
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // Right Petal
            System.out.print(" *");

            System.out.println();
        }

        // ==========================
        // Center Part of Lotus
        // ==========================
        for (int i = 1; i <= (2 * n); i++) {
            System.out.print("* ");
        }
        System.out.println();

        // ==========================
        // Lower Half of Lotus
        // ==========================
        for (int i = n; i >= 1; i--) {

            // Print leading spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Left Petal
            System.out.print(" *");

            // Space between petals
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // Middle Petal
            System.out.print(" *");

            // Space between middle and right petal
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // Right Petal
            System.out.print(" *");

            System.out.println();
        }

        // ==========================
        // Stem of Lotus
        // ==========================
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= n * 2; j++) {
                System.out.print(" ");
            }

            System.out.println("   *");
        }
    }
}