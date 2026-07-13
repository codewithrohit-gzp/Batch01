package Day19;

public class firstLetterToUpperCase {

    public static String convertToUppercase(String str) {
        int n = str.length();

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // loop
        for (int i = 0; i < n; i++) {

            // check
            if (str.charAt(i) == ' ' && i < str.length() - 1) {

                sb.append(str.charAt(i)); // space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // next Char

            } else {
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "i am petter";

        System.out.println(convertToUppercase(str));
        ;

    }

}
