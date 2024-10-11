import java.io.IOException;
import java.util.Scanner;

public class inputOutput3 {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        float a;
        float b;
        a= sc.nextFloat();
        b= sc.nextFloat();
        System.out.printf("%.2f %.2f" , a,b);

    }
}
