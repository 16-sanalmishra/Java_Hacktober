public class firstrepeat {
    public static void main(String[] args) {
        String x = "sword";
        int len = x.length();
        int count = 0;
        for(int i =0; i<len; i++){
            for(int j =i+1; j<len; j++){
                if(x.charAt(i)== x.charAt(j))
                    count+=1;
                  continue;  
            }
           
           
        }
        System.out.print(count);
       
       
    }
}
