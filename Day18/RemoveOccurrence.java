package Day18;

public class RemoveOccurrence {

    public static String removeOccurrence(String s, String part) {

        // int index =s.indexOf(part);

        while (s.indexOf(part) != -1) {
            s = s.substring(0, s.indexOf(part)) + s.substring(s.indexOf(part) + part.length());

        }

        return s;

    }

    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        // 1. dabaabcbc
        // 2. dababc
        // 3. dab

        // String str = "dab";
        // removeOccurrence(str, part);

        // System.out.println(removeOccurrence(str, part));

        // System.out.println(str.indexOf(part)); // start from index -0 and if notfound
        // then return -1
        // System.out.println(str.substring(0, str.indexOf(part)));
        // System.out.println(str.substring(str.indexOf(part) + part.length()));
        // System.out.println(str.substring(5));

        // System.out.println(str.indexOf(part));
        // System.out.println(str.substring(str.indexOf(part) + part.length()));

        // int index = str.indexOf(part);

        // while (str.indexOf(part) != -1) {
        // str = str.substring(0, str.indexOf(part)) + str.substring(str.indexOf(part) +
        // part.length());

        // }

        // System.out.println(str);
        // --------------------------------------------------------------------->
        // String text = "JavaProgramming";
        // // Index positions: J(0), a(1), v(2), a(3), P(4)...
        // String result = text.substring(4);

        // System.out.println(result);
        // // Output: Programming

        // --------------------------------------------------------------------->
        // String text = "JavaProgramming";
        // // Starts at 0 ('J') and stops right before index 4 ('P')
        // String result = text.substring(0, 4);

        // System.out.println(result);
        // Output: Java

    }
}
