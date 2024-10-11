interface firstInterface{
    final int id = 10;
    void display();
}


public class abstractJava implements firstInterface {
    @Override
    public void display(){
        System.out.println("Interface Implemented");
    }
    public static void main(String[] args) {
        abstractJava ab = new abstractJava();
        ab.display();
        int n = ab.id;
        System.out.println(n);
    }
}
