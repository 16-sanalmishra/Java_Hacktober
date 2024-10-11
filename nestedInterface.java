public class nestedInterface {

    interface it1 {
        default void display() {
            System.out.println("Interface Implemented");
        }
    }
}

class A implements nestedInterface.it1 {
    @Override
    public void display() {
        System.out.println("Nested Interface Implemented");
    }
}

class runnerCode{
    public static void main(String[] args) {
        A a = new A();
        a.display();
    }
}