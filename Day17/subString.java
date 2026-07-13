package Day17;

import java.util.Scanner;

public class subString {

    public static String printSubString(String str, int si, int ei) {
        String store = " ";
        for (int i = si; i < ei; i++) {
            store += str.charAt(i); // str(i)
        }
        return store;

    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        String str2 = "i am a good boy";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Stating Index :");
        int si = sc.nextInt();

        System.out.println("Enter you Ending Index :");
        int ei = sc.nextInt();
        System.out.println(printSubString(str, si, ei));

    }

}
