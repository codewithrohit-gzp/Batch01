public class reverseNumber {
    public static void main(String[] args) {
        // Print Reverse of the number
        int n = 1000;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }

    }

}
