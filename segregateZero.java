import java.util.Arrays;
import java.util.Scanner;

public class segregateZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        int b[] = new int[len];
        for(int i =0; i<len; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i =0; i<len; i++){
            System.out.print(a[i]+" ");
        }

      }
}
