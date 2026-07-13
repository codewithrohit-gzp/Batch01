package Day17;

public class compare {

    public static void main(String[] args) {

        String name1 = "Alok";
        String name2 = "Alok";
        String name3 = new String("Alok");

        if (name1 == name2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // if (name1 == name3) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not Equal");
        // }

        // .equals() -->this is the methods in java to compare the strings
        if (name1.equals(name3)) { // boolan ->true or false
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }

}
