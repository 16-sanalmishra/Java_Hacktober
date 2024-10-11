import java.io.IOException;
import java.util.Scanner;

public class inputOutput2 {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        int a;
        float b ;
        char ch;
        a= sc.nextInt();
        b= sc.nextFloat();
        ch= sc.next().charAt(0);

        System.out.printf("%d$%.2f$%c", a,b,ch);

    }
}
