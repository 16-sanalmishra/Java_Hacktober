import java.util.*;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a[] = s.toCharArray();
        for(int i =0; i<s.length(); i++){
            if(a[i]>=65 && a[i] <=90){
                continue;
            }

            else if(a[i]== 'a' ||
            a[i]== 'e' ||
            a[i]== 'i' ||
            a[i]== 'o' ||
            a[i]== 'u' ||
            a[i]== 'A' ||
            a[i]== 'E' ||
            a[i]== 'I' ||
            a[i]== 'O' ||
            a[i]== 'U'){
                a[i] = (char) (a[i] - 32);
            }
        }
        System.out.println(a);
    
    
    
    
    
    sc.close();
    }
}
