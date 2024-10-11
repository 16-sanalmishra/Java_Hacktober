public class foreachP {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int a : arr){
            if(a%2==0){
                System.out.println(a);
            }
        }
        int i=5;
        while(i>0){
            System.out.println("Hello");
            i--;
        }
    }
}
