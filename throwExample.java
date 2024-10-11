import java.util.Scanner;

public class throwExample extends Exception {
    
   public int avgNo(int a, int b) throws ArithmeticException{
        int avg = (a+b)/2;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        throwExample t = new throwExample();
        int n,m;
        try{
            n=sc.nextInt();
            m = sc.nextInt();
           int res =  t.avgNo(n,m);
           System.out.println(res);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Program Completed");
        }
        sc.close();
    }
}
