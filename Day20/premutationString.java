package Day20;

class premutationString {

    public static boolean isfreqSame(int[] freq, int[] windfreq) {
        for (int i = 0; i < 26; i++) { // a to z -->26

            if (freq[i] != windfreq[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        // s1 frequency1
        int freq[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int idx = s1.charAt(i) - 'a';
            freq[idx]++;
        }

        int windSize = s1.length(); // 2

        for (int i = 0; i < s2.length(); i++) {
            int windIdx = 0;
            int idx = i;

            // s2 freq
            int windfreq[] = new int[26];
            while (windIdx < windSize && idx < s2.length()) {
                int idxx = s2.charAt(idx) - 'a';
                windfreq[idxx]++;
                windIdx++;
                idx++;
            }

            if (isfreqSame(freq, windfreq)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "dab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));

    }

}