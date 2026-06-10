package Day05;

public class swap {

    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        return;

    }

    public static void main(String[] args) {

        // Call By Value
        int a = 5;
        int b = 3;
        swap(a, b);
        System.out.println("a :" + a);
        System.out.println("b :" + b);

    }

}
