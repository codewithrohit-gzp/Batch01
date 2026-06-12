package Day06;

public class functionsOverloading {
    // Function Overloading using Parameters
    public static int sum(int a, int b) { // sum of two numbers
        return a + b;

    }

    public static int sum(int a, int b, int c) { // sum of three numbers
        return a + b + c;

    }

    public static int sum(int a, int b, int c, int d) { // sum of three numbers
        return a + b + c + d;

    }

    // Using data Types
    public static float sum(float a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // System.out.println("Sum of Two number: " + sum(5, 3));

        // System.out.println("Sum of Three number: " + sum(5, 3, 9));

        // System.out.println("Sum of Four number: " + sum(5, 3, 9, 4));

        float store = sum(2.5f, 5);
        System.out.println("Sum of two value :" + store);

    }

}
