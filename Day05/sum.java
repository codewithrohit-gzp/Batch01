package Day05;

public class sum {

    public static int sum(int a, int b) { // parameters

        int c = a + b;
        return c;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println(sum(a, b));

        int store = sum(a, b); // Argements

        System.out.println("Sum :" + store);

    }

}
