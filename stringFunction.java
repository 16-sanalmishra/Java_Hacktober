import java.util.StringTokenizer;

public class stringFunction {
    public static void main(String[] args) {
        String s = "SanalMishraGLA";
        StringBuffer s1 = new StringBuffer("SanalMishra");
        StringBuilder s2 = new StringBuilder("SanalMishra");
        if(s1.equals(s2)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        System.out.println(s1+"GLA");
        if(s=="SanalMishraGLA"){
            System.out.println("Matched");
        }
        else{
            System.out.println("Not Matched");
        }
        
        
    }
}
