package Chapter3.Exercise;

import java.util.Scanner;

public class RetirementGoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfYears;
        double amountToBeSaved;


        while (true) {
            System.out.print("Enter the number of years until retirement: ");
            noOfYears = sc.nextInt();
            if (noOfYears > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive number.");
        }


        while (true) {
            System.out.print("Enter the amount of money you can save annually: ");
            amountToBeSaved = sc.nextDouble();
            if (amountToBeSaved > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive number.");
        }

        //double totalSavings = noOfYears * amountToBeSaved;
        //System.out.println("You will have saved " + totalSavings + " by retirement" );

        double savings = amountToBeSaved;

        for(int i = 1; i <= noOfYears; i++){
            System.out.print("Year " + i + " = $" +  savings + "\n");
            //totalSavings += amountToBeSaved;
            if(i !=5){
                savings = savings + (savings * 0.10);
            }


        }

        System.out.println("==========Retirement Calculations=========="+ "\n" +"Your savings would have grown to $" +  savings + " in " + noOfYears + " years. From your initial deposit of $" + amountToBeSaved );

    }
}
