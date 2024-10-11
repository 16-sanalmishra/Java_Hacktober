import java.util.*;

public class myException extends Exception {
    myException(String s) {
        super(s);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        try {
            n = sc.nextInt();

            if (n > 100) {

                myException me = new myException("This is an Exception!!!");
                throw me;
            } else {
                System.out.println("Valid Entry");
            }
        }

        catch (myException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
