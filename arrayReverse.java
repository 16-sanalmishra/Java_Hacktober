import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The reversed array is:");
        for(int j = len-1; j>=0; j--){
            System.out.print(arr[j]+" ");
        }

    }
}
