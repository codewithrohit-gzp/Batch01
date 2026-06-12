package Day06;

public class factorial {

    // functions ->factorial
    public static int calculateFact(int n) {
        int store = 1;

        for (int i = 1; i <= n; i++) {
            store = store * i; // store * =i;
        }
        return store;

    }

    public static void main(String[] args) {
        System.out.println(calculateFact(5));
        // int fact = calculateFact(5);
        // System.out.println("Factorial :" + fact);

    }

}
