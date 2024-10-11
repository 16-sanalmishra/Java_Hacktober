
import java.util.*;

public class stringReversal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        
        int len = A.length();
        char a[] = A.toCharArray();
        char b[] = new char[len];
        
        for(int i = len-1; i>=0; i--){
            b[i] = a[i];
        }
        if(Arrays.equals(a,b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
        
        
    }
}



