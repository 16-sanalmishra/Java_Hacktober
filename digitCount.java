import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b;
        int count =0;
        if(a!=0){
        while(a!=0){
            b = a/10;
            count++;
            a=a/10;
        }
        System.out.println(count);
    }
    else{
        System.out.println(0);
    }
   

        
    }
}
