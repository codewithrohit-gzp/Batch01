package Day19;

public class Vowels {

    public static int checkVowels(String str) {
        // vowels ->aeiou
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // Char
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "Simon, go back go back";
        // String str2 = "cdf";

        System.out.print(checkVowels(str));
        ;

    }

}
