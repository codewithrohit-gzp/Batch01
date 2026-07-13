
package Day18;

class compareChar {

    public static String compareString(String str) {
        String newStr = "";
        int count = 0;
        // abbc

        for (int i = 0; i < str.length(); i++) {
            // condition
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count;

            }
        }

        return newStr;

    }

    public static void main(String[] args) {

        String str = "aaabbccdd";
        System.out.println(compareString(str));

    }

}
