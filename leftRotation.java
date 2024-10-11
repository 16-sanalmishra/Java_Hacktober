
/**
 * leftRotation
 * 
 */
import java.util.*;

public class leftRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        
        int r = sc.nextInt();
        for(int i= 0; i<len; i++){
             arr[i]= sc.nextInt();  
        } 
        
        for(int i = 0; i<r ; i++){
            int j,temp;
            temp = arr[0];
            for(j= 0; j<len-1; j++){
                arr[j]= arr[j+1];
                
            }
           arr[j] = temp;
        }
    
       for(int i =0; i<len; i++){
           System.out.print(arr[i]+" ");
       }
       sc.close();

    }









        
    }