package Chapter4;

public class ReturnTypeMethods {
    public static void main(String[] args) {
        getAddress();
    }

    public static String getAddress(){
        return "123 Main Rd";
    }

    public static int getSum()
    {
        int num1 = 5;
        int num2 = 10;

        return num1 + num2;
    }

    public static boolean isEven()
    {
        int num = 13;
        return num % 2 == 0;
    }
}
