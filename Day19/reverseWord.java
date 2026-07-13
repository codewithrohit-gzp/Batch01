package Day19;

class reverseWord {

    public static String revWord(String s) {

        StringBuilder ans = new StringBuilder();
        int n = s.length();

        StringBuilder revString = new StringBuilder(s);

        revString.reverse();

        for (int i = 0; i < n; i++) {

            StringBuilder word = new StringBuilder();

            while (i < n && revString.charAt(i) != ' ') {
                word.append(revString.charAt(i));
                i++;
            }
            word.reverse();

            if (word.length() > 0) {
                ans.append(" ").append(word);

            }
        }
        return ans.substring(1);

    }

    public static void main(String[] args) {

        // StringBuilder s = new StringBuilder(" The sky is blue");
        String s = "The sky is blue";
        System.out.println(revWord(s));

    }
}
