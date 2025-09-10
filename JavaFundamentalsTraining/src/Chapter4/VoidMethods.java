package Chapter4;

public class VoidMethods {
    public static void main(String[] args) {
        displayMessage();
        System.out.println("====================");
        displayAddress();
    }

    public static void displayMessage(){
        System.out.println("Hello, Welcome to Java Fundamentals!" );
    }

    private static void displayAddress(){
        System.out.println("""
                234 Rivonia Street.
                Sandton
                1234""");
    }
}
