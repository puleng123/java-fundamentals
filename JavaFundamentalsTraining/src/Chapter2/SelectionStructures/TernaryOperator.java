package Chapter2.SelectionStructures;

public class TernaryOperator {

    public static void main(String[] args) {

        //condition ? resultWhenTrue : resultWhenFalse
        int num1 = 5, num2 =7;
        int smallNum;

        if (num1 < num2) {
            smallNum = num1;
        }
        else {
            smallNum = num2;
        }

        //variable = condition ? resultWhenTrue : resultWhenFalse
        smallNum = num1 < num2 ? num1 : num2;

        int number = 5;
        String results = "";

        if (number % 2 == 0)
        {
            System.out.println("Even number");
        }
        else if(number % 5 == 0)
        {
            System.out.println("multiple of 5");
        }
        else
        {
            System.out.println("Odd");
        }

        //using ternary
        results = number % 2 == 0 ? "Even" : number % 5 ==0 ? "Multiple of 5" : "Odd";
        System.out.println(results);
    }
}
