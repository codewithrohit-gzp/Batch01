package Day17;

public class stringBuilder {
    public static void main(String[] args) {
        // String sb = "";
        StringBuilder sb = new StringBuilder(" ");

        String para = "i am good in dsa with java"; // convert into the UppderCase of each first latter

        for (char ch = 'a'; ch < 'z'; ch++) {
            sb.append(ch);

        }

        System.out.println(sb);
        System.out.println("length of the sb :" + sb.length());

        // time complexity O(n)

    }

}
