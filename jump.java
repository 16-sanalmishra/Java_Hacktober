public class jump {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int len = arr.length;
        for(int i=0; i<len; i++){
            
            if(arr[i]==5){
                break;
            }
            System.out.println(arr[i]);
        }
        System.out.println("Break is executed");
    }
}
