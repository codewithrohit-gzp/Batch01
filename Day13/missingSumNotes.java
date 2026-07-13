package Day13;

public class missingSumNotes {

    public static void main(String[] args) {

        // -> total sum
        // ->remain sum
        // -> find =total sum -remain sum

        // code
        int money[] = { 0, 5, 1, 3, 2, 4, 6, 8 }; // total =29

        int l = money.length;

        int totalSum = 0; // 0,10,20,50 -->update

        int mySum = 0;

        // MySum
        for (int i = 0; i <= l; i++) {
            mySum = mySum + i; // mySum += i;
        }

        // total Sum of Array
        for (int i = 0; i < l; i++) {
            totalSum = totalSum + money[i];
        }

        int missing = mySum - totalSum;

        System.out.println("Total sum :" + totalSum);
        System.out.println("My sum :" + mySum);

        System.out.println("Missing Value :" + missing);

    }
}
