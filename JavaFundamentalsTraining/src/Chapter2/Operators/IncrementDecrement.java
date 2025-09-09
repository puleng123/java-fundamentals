package Chapter2.Operators;

public class IncrementDecrement {

    public static void main(String[] args) {
        int number = 25;

        System.out.println("orginal no: " + number);
        System.out.println("Was incremented by one: " + number++);
        System.out.println("new number is: " + number);
        System.out.println("Was decremented by one: " + number--);


        System.out.println("*****************************************************");
        number = 25;
        System.out.println("original number is: " + number);
        System.out.println("Was incremented by one: " + ++number);
        System.out.println("new number is: " + number);
        System.out.println("Was decremented by one: " + --number);
        System.out.println("new number is: " + number);
    }
}
