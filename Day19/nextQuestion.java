package Day19;

public class nextQuestion {

    public static String removeOccurrence(String s, String part) {

        while (s.indexOf(part) != -1) { /// abc abc abc abc -1
            s = s.substring(0, s.indexOf(part)) + s.substring(s.indexOf(part) + part.length());
        }
        return s;

    }

    public static void main(String[] args) {

        // String s = "daabcdabcb";
        // 0123456789
        // "dadabcb"
        // "dadb" <--result

        String s = "daabcdabcb";
        String part = "abc"; // 3
        System.out.println(removeOccurrence(s, part));

        // System.out.println("first ->" + s.substring(0, 2));
        // System.out.println("last ->" + s.substring(5));
        // System.out.println(s.substring(0, 2) + s.substring(5));

        // s.indexOf(si, end);
        // System.out.println(s.indexOf(part));
        // s.substring(bi,li) //i=0; i<n; i++
        // System.out.println(s.substring(2, 5));

        // System.out.println(s.substring(5));

    }

}
