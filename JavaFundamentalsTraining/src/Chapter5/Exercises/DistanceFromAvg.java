package Chapter5.Exercises;

import java.util.Scanner;

public class DistanceFromAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;

        while (count < numbers.length) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("You entered 0, program exited");
                break;
            }

            numbers[count] = input;
            count++;
        }

        System.out.println("**************Display Average*********************");
        if (count > 0)
        {
            //calculating sum of entered values
            double sum = 0;
            for (int i = 0; i < count; i++)
            {
                sum += numbers[i];
            }
            //calculate avg and display
            double average = sum / count;
            System.out.println("Average is = " + average);

            System.out.println("**************Display Values and their distance*********************");
            System.out.println("Distance from average for each value:");
            for (int i = 0; i < count; i++)
            {
                double distance = Math.abs(numbers[i] - average);
                System.out.println("Value: " + numbers[i] + " → Distance: " + distance);
            }
        }
        else
        {
            System.out.println("No values entered. No Avg nor Distance to be displayed");
        }
    }
}