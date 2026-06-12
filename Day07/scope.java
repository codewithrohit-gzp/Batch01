package Day07;

public class scope {

    void scopesAccess() {
        int b = 30;
    }

    public static void main(String[] args) {

        System.out.println(b);

        // what is methods scope .?
        // int a = 25;
        // int b = 30;
        // System.out.println(a);

        // what is block scope ..?
        // {
        // int b = 30;
        // System.out.println(b); //we have access
        // }

        // System.out.println(b); // we can't access ->error

        // when out side the curly {} b =30;

        {
            System.out.println(b); // we have access
        }

        System.out.println(b); // we can't access ->error

        // -------------------------------------------------
        // class scope
        // public
        // private ---------------OOPs
        // protacted

    }

}
