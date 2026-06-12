package Day07;

public class hollowRectangle {

    // function Print Hollow Rectangle

    public static void printHollowRectangle(int totalRows, int totalCols) {

        // Outer Loop
        for (int i = 1; i <= totalRows; i++) {
            // Inner Loop
            for (int j = 1; j <= totalCols; j++) {
                // print stars (i,j)
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            // this is for the next line
            System.out.println();

        }
    }

    public static void main(String[] args) {

        printHollowRectangle(10, 10);

    }

}
