public class printReverseNumber {

    public static void main(String[] args) {

        int n = 105897;
        int store = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            store = (store * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(store);

    }

}
