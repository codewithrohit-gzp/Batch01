package Day18;

public class toUpperCase {
    public static String toUpperCaseConvert(String str) {

        StringBuilder store = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        store.append(ch);
        for (int i = 1; i < str.length(); i++) {
            // check --space and next character
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                store.append(str.charAt(i));
                i++;
                store.append(Character.toUpperCase(str.charAt(i)));

            } else {
                store.append(str.charAt(i));
            }
        }

        return store.toString();

    }

    public static void main(String[] args) {

        String str = "hi, i am tony";
        System.out.println(toUpperCaseConvert(str));

    }

}
