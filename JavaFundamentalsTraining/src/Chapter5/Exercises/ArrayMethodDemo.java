package Chapter5.Exercises;

import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {

        // declaring
        int[] numbers = new int[8];

        // prompt user
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < numbers.length) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = sc.nextInt();
            count++;
        }
        System.out.print("Enter a limiting value: ");
        int limit = sc.nextInt();

        System.out.println("***********display input************");
        displayInt(numbers);

        System.out.println("***********display reversed input***********");
        displayInReverse(numbers);

        System.out.println("***********displays Sum***********");
        displaySum(numbers);

        System.out.println("***********Limiting ***********");
        displayLessThanLimit(numbers, limit);

        System.out.println("***********Displays Avg***********");
        displayGreaterThanAverage(numbers);
    }

    // displaying all integers
    public static void displayInt(int[] numbers) {
        for(int n : numbers){
            System.out.println(n);
        }
    }

    // displaying integers in reverse form
    public static void displayInReverse(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    //displaying sum
    public static void displaySum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum of all numbers: " + sum);
    }

    //display all values less than a limiting argument
    public static void displayLessThanLimit(int[] numbers, int limit) {
        System.out.println("Your specified limit is: " + limit);
        for (int n : numbers) {
            if (n < limit) {
                System.out.println(n);
            }
        }
    }


    //display all values that are higher than the calculated average value.
    public static void displayGreaterThanAverage(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        double average = (double) sum / numbers.length;
        System.out.println("\t Average value: " + average + "\n Numbers that are higher than your avg are: " );
        for (int n : numbers) {
            if (n > average) {
                System.out.println(n);
            }
        }
    }

}