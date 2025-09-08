package Chapter1;

import java.util.Scanner;

public class FundraiserClub {
    public static void main(String[] args) {
        double adultMealPrice;
        int adultOrders;
        double childMealPrice;
        int childOrders;

        String welcomeMessage = "Welcome to ABC Social Club";

        Scanner sc = new Scanner(System.in);
        //using
        System.out.println("Please enter the price of the adult meal: ");
        adultMealPrice = sc.nextDouble();
        System.out.println("Please enter the price of the child meal: ");
        childMealPrice = sc.nextDouble();

        System.out.println("How many adults ordered: ");
        adultOrders  = sc.nextInt();
        double totalForA = adultMealPrice * adultOrders;

        System.out.println("How many children ordered: ");
        childOrders  = sc.nextInt();
        double totalForC = childMealPrice * childOrders;

        double totalPrice = totalForA + totalForC;

        System.out.println("\n=================Details=============");
        System.out.println(welcomeMessage);
        System.out.println("Adult meal price: R" + adultMealPrice);
        System.out.println("Children meal price: " + childMealPrice);
        System.out.println("The total amount for adult orders: R" + totalForA);
        System.out.println("The total amount for child orders: R" + totalForC);
        System.out.println("We made R" + totalPrice + " from adult and child meals for the day");
    }
}
