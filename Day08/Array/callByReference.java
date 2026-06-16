package Array;

public class callByReference {

    // update funtion
    public static void updateNumber(int marks[], int unChangeable) { // as parm..
        unChangeable = 15;
        // call by ref
        int l = marks.length;
        for (int i = 0; i < l; i++) {
            marks[i] = marks[i] + 2;
            // return;

        }

    }

    // Here we see the call by Ref..! how to work
    public static void main(String[] args) {
        // students marks
        int marks[] = { 85, 96, 25, 74 };
        int unChangeable = 10;

        updateNumber(marks, unChangeable); // argment

        System.out.println("Unchangeable :" + unChangeable);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }

}
