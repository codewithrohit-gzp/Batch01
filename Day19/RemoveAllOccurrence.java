package Day19;

public class RemoveAllOccurrence {

    public static String removeString(String str, String check) {
        // String str = "daabcbcadc";
        // String str = "dabcadc";
        // String str = "dadc"; //output

        // String check = "abc";
        while (str.indexOf(check) != -1) {
            int index = str.indexOf(check);
            str = str.substring(0, index) + str.substring(index + check.length());
        }

        return str;

    }

    public static void main(String[] args) {

        String str = "daabcbcadc";
        String check = "abc";

        System.out.println(removeString(str, check));

        // check.length();
        // daabcbcadc
        // 0123456789

        // String methods
        // ------------>indexOf();
        // ------------->substring(firstIndex,lastIndex)
        // System.out.println(str.indexOf(check)); // i=0; i<3; i++
        // System.out.println(str.substring(0, 4));
        // System.out.println(str.substring(4));

    }

}
