package Array;

public class attendenceList {

    public static void main(String[] args) {

        int att[] = { 1, 0, 1, 1, 0, 1, 0, 1 };
        int present = 0; // 1
        int absent = 0; // 0
        int l = att.length;

        for (int i = 0; i < l; i++) {
            // check if 1 --> p otherwise 0 -->A
            if (att[i] == 1) {
                present++;
            } else {
                absent++;
            }

        }

        System.out.println("Number of Students is Present :" + present);
        System.out.println("Number of Students is Absent :" + absent);

    }

}
