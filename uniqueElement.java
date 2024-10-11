import java.util.Scanner;

public class uniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        for(int i =0; i<len; i++){
            a[i] = sc.nextInt();
        }
        for(int i =0; i<len; i++){
            int cnt = 0;
            for(int j = 0; i<len; j++){
                if(a[j] == a[i]){
                    cnt++;
                }

            }
            System.out.println(cnt);

        }










        sc.close();
    }
    
}
